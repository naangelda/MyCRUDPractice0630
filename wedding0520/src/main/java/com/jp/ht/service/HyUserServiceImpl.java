package com.jp.ht.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.ht.query.HyUserQuery;
import com.jp.ht.vo.HyUser;

import cn.org.rapid_framework.page.Page;
import common.base.EntityDao;

@Service
public class HyUserServiceImpl implements HyUserIService {
	
	@Autowired
	EntityDao<HyUser,Integer> hyUserDao;
	
	
	@Override
	public void save(HyUser user) {
		hyUserDao.save(user);
	}
	
	
	@Override
	public void deleteByIds(Map<String, Object> params) {
		hyUserDao.deleteByIds(params);
	}


	@Override
	public void update(HyUser user) {
		hyUserDao.update(user);;
	}


	@Override
	public Page findPage(HyUserQuery query) {
		return hyUserDao.pageQuery("HyUser.findPage",query);
	}
	

	public List<HyUser> findByCondition(HyUserQuery query) {
		
		return hyUserDao.findByCondition(query);
	}


	@Override
	public HyUser findById(Integer id) {
		return  (HyUser)hyUserDao.getById(id);
	}
	
	
	
}
