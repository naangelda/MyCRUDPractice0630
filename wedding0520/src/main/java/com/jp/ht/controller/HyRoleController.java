package com.jp.ht.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.ht.query.HyRoleQuery;
import com.jp.ht.query.TmenuQuery;
import com.jp.ht.service.HyRoleIService;
import com.jp.ht.service.TmenuIService;
import com.jp.ht.vo.HyRole;
import com.jp.ht.vo.Tmenu;

import cn.org.rapid_framework.page.Page;
import common.dwz.DwzBaseRestSpringController;

@Controller
@RequestMapping("/hysw/hyrole")
public class HyRoleController extends DwzBaseRestSpringController<HyRole,java.lang.Integer>{
	
	@Autowired
	HyRoleIService  hyRoleServiceImpl; 
	
	@Autowired
	TmenuIService tmenuServiceImpl;
	
	@RequestMapping
	public String index(ModelMap model,HyRoleQuery query) {
		Page page=hyRoleServiceImpl.findPage(query);
		model.addAllAttributes(toModelMap(page, query));
		return "/hyrole/index";
	}
	
	@RequestMapping("/new")
	 public String _new(ModelMap model,HyRole hyRole) {
	   model.addAttribute("hyRole",hyRole);
	   TmenuQuery tmenuQuery=new TmenuQuery();
	   tmenuQuery.setParentId(0);
	  
	   List<Tmenu>menuList=tmenuServiceImpl.findByCondition(tmenuQuery);
	   model.addAttribute("menuList",menuList);
	   
	   return "/hyrole/edit";
	  }
	
	@RequestMapping("/{id}/edit")
	 public String edit(ModelMap model,@PathVariable Integer id) {
		
//		HyRoleQuery hyRoleQuery = new HyRoleQuery();
//		hyRoleQuery.setRoleId(id);
//		List<HyRole> hyRoleList = hyRoleServiceImpl.findByCondition(hyRoleQuery);
		
		HyRole hyRole = hyRoleServiceImpl.findById(id);
		
		TmenuQuery tmenuQuery=new TmenuQuery();
		tmenuQuery.setParentId(0);
		
		List<Tmenu> menuList = tmenuServiceImpl.findByCondition(tmenuQuery);
		
//		String[] menuIds = hyRole.getMenuIds().split(",");
//		for (int i = 1; i < menuIds.length; i++) {
//			for (Tmenu tmenu : menuList) {
//				if (tmenu.getMenuId().equals(new Integer(menuIds[i]))) {
//					tmenu.setField1("Y");
//				} else {
//					tmenu.setField1("N");
//				}
//			}
//		}
		
		String menuIds = hyRole.getMenuIds();
		for (Tmenu tmenu : menuList) {
			if (menuIds.contains(","+tmenu.getMenuId()+",")){
				tmenu.setField1("Y");
			} else {
				tmenu.setField1("N");
			}
		}
		
		
		
		if(hyRole.getRoleStatus()!=null&&hyRole.getRoleStatus().equals("Y")) {
			model.addAttribute("all","Y");
		}else {
			model.addAttribute("all","N");
		}
		
		model.addAttribute("hyRole", hyRole);
		model.addAttribute("menuList",menuList);
	   
		return "/hyrole/edit";
	  }
	
	@RequestMapping("/update")
	public String update(ModelMap model,@Valid HyRole hyRole,HttpServletRequest req,HttpServletResponse resp)throws Exception {

		hyRole.setCreateTime(new Date());
		String[] menuIds= req.getParameterValues("menuIds");
		String menusId = StringUtils.join(menuIds,",");//"1,2,3"
		hyRole.setMenuIds(","+menusId+",");//",1,2,3,"
		
		String[] menuIdArr = menusId.split(",");
		if(menuIdArr.length>=9) {
			hyRole.setRoleStatus("Y");
		}else {
			hyRole.setRoleStatus("N");
		}
		
		if(hyRole.getRoleId()!=null) {

			super.NAVTABID = this.NAVTABID+"1";
			hyRoleServiceImpl.update(hyRole);
			
		}else {
			
			hyRoleServiceImpl.save(hyRole);
		}
		
		return "/saveSucc";
	}
	
	@RequestMapping(value="/deleteRow",method=RequestMethod.POST)
	@ResponseBody
	public Object deleteRow(ModelMap model, Integer id) {
		

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag", true);
		map.put("msg","删除成功");
		
		hyRoleServiceImpl.deleteById(id);
		
		
		return map;
	}
	
}
