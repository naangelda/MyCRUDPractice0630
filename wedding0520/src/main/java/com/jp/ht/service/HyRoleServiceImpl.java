package com.jp.ht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.ht.query.HyRoleQuery;
import com.jp.ht.vo.HyRole;
import com.jp.ht.vo.HyUser;

import cn.org.rapid_framework.page.Page;
import common.base.EntityDao;

@Service
public class HyRoleServiceImpl implements HyRoleIService{

	@Autowired
	EntityDao<HyRole,Integer> hyRoleDao;
	
	@Override
	public List<HyRole> findAll() {
		return hyRoleDao.findAll();
	}

	@Override
	public List<HyRole> findByCondition(HyRoleQuery query) {
		return hyRoleDao.findByCondition(query);
	}

	@Override
	public Page findPage(HyRoleQuery query) {
		return hyRoleDao.pageQuery("HyRole.findPage",query);
	}

	@Override
	public void save(HyRole hyRole) {
		hyRoleDao.save(hyRole);
	}
	
	
	@Override
	public void update(HyRole hyRole) {
		hyRoleDao.update(hyRole);
		
	}

	@Override
	public HyRole findById(Integer id) {
		return (HyRole)hyRoleDao.getById(id);
	}

	@Override
	public void deleteById(Integer id) {
		hyRoleDao.deleteById(id);
	}
	
	
	
}
