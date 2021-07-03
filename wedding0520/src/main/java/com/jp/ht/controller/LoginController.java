package com.jp.ht.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.ht.query.HyUserQuery;
import com.jp.ht.query.TmenuQuery;
import com.jp.ht.service.HyUserIService;
import com.jp.ht.service.TmenuIService;
import com.jp.ht.vo.HyUser;
import com.jp.ht.vo.Tmenu;

@Controller
@RequestMapping("/security")
public class LoginController {
	
	@Autowired
	HyUserIService hyUserServiceImpl;
	@Autowired
	TmenuIService tmenuServiceImpl;
	
	@RequestMapping(value="/access")
	public String access() {
		return "login";
	}
	@RequestMapping(value="/login")
	public String login(HttpServletRequest req,HttpSession session,String username,String password,
			String checkcode) {
		String msg=null;
		HyUserQuery userQuery = new HyUserQuery();
		userQuery.setUserNo(username);
		userQuery.setField1(password);
		List<HyUser> hyUserList = hyUserServiceImpl.findByCondition(userQuery);
		
		System.out.println(hyUserList);
		
		if(hyUserList==null||hyUserList.size()==0) {
			msg="用户名或密码错误";
			req.setAttribute("msg", msg);
			req.setAttribute("errorType", "LOGIN_USER_ERROR");
			return "login";
		}
		//login success
		//1,user into session
		//2,准备登陆进来后需要展示的data-->menu
		TmenuQuery tmenuQuery = new TmenuQuery();
		HyUser user = hyUserList.get(0);	
		if("Y".equals(user.getIsAdmin())) {
			tmenuQuery.setParentId(0);
			List<Tmenu> tmenuList = tmenuServiceImpl.findByCondition(tmenuQuery);
			for(Tmenu  tmenu:tmenuList) {
				//1，取得每一个menuId作为menuQuery的parentId
				tmenuQuery.setParentId(tmenu.getMenuId());
				//2，依靠获取的parentId去查询出所有子菜单然后加入到父菜单的sonList
				tmenu.setSonList(tmenuServiceImpl.findByCondition(tmenuQuery));
			}
			req.setAttribute("menuList", tmenuList);
			
		}else {
			
			
		}
		
		session.setAttribute("LOGIN_USER_KEY", user.getRealName());
		session.setAttribute("roleId",user.getRoleId());
		
		return "adminIndex";
	}
}
