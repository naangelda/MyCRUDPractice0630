package com.jp.ht.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ffcs.newgeye.util.FFCSLinkMap;
import com.jp.ht.query.HyUserQuery;
import com.jp.ht.service.HyRoleIService;
import com.jp.ht.service.HyUserIService;
import com.jp.ht.vo.HyRole;
import com.jp.ht.vo.HyUser;

import cn.org.rapid_framework.page.Page;
import common.dwz.DwzBaseRestSpringController;

@Controller
@RequestMapping("/hyuser")
public class HyUserController extends DwzBaseRestSpringController<HyUser, Integer>{
	@Autowired
	HyUserIService hyUserServiceImpl;
	
	@Autowired
	HyRoleIService hyRoleServiceImpl;
	
	

	@RequestMapping
	public String index(ModelMap model ,HyUserQuery query) {
		FFCSLinkMap orderColumnsMap = new FFCSLinkMap();
		orderColumnsMap.put("userId", "DESC");
		Page page = hyUserServiceImpl.findPage(query);
		model.addAllAttributes(toModelMap(page,query));//toModelMap is from parent class: DwzBaseRestSpringController
		return "hyuser/index";
		
	}
	
	/* 进入新增 */
	@RequestMapping(value="/new")
	public String _new(ModelMap model,HyUser hyUser) {
		
		model.addAttribute("hyUser",hyUser);
		List<HyRole> roleList = hyRoleServiceImpl.findAll();
		model.addAttribute("roleList", roleList);
		return "hyuser/edit";
	}
	
	/* 进入修改 */
	@RequestMapping(value="/{id}/edit")
	public String edit(ModelMap model,@PathVariable Integer id) {
		
		/*方法1：利用Query和findByCondition获取userList然后将userList.get(0)传回前端*/
//		HyUserQuery userQuery = new HyUserQuery();
//		userQuery.setUserId(id);//配置查询条件为使用id
//		List<HyUser> hyUserList = hyUserServiceImpl.findByCondition(userQuery);
//		if(hyUserList!=null&&hyUserList.size()>0) {
//			model.addAttribute("hyUser",hyUserList.get(0));
//		}
		
		/*方法2：直接利用findById获取*/
		HyUser hyUser = hyUserServiceImpl.findById(id);
		model.addAttribute("hyUser",hyUser);
		
		List<HyRole> roleList = hyRoleServiceImpl.findAll();
		model.addAttribute("roleList", roleList);
		return "hyuser/edit";
	}
	
	/* 保存修改或新建user */
	@RequestMapping(value="/update")
	public String saveUser(ModelMap model ,@Valid HyUser hyUser)throws Exception {
		HyRole hyRole = hyRoleServiceImpl.findById(hyUser.getRoleId());
		hyUser.setCreateTime(new Date());
		if(hyRole.getRoleStatus()!=null&&hyRole.getRoleStatus().equals("Y")) {
			hyUser.setIsAdmin("Y");
		}else {
			hyUser.setIsAdmin("N");
		}
		if(hyUser.getUserId()!=null) {//修改
			super.NAVTABID = this.NAVTABID+"1";
			hyUserServiceImpl.update(hyUser);
		}else {//新增
			hyUser.setField1("123");
			hyUser.setUserStatus("Y");
			hyUserServiceImpl.save(hyUser);
		}
		return "saveSucc";
	}
	
	@RequestMapping(value="/batchDelete")
	@ResponseBody
	public Object batchDelete(ModelMap model,String ids) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("flag", true);
		map.put("msg","删除成功");
		String temp = ids;
		if(ids.endsWith(",")) {
			temp=ids.substring(0,ids.lastIndexOf(","));
		}
		String[] idsArr = temp.split(",");
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("items",idsArr);
		hyUserServiceImpl.deleteByIds(params);
		return map;
	}
}
