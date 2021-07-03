package com.jp.ht.service;

import java.util.List;

import com.jp.ht.query.HyRoleQuery;
import com.jp.ht.vo.HyRole;

import cn.org.rapid_framework.page.Page;

public interface HyRoleIService {
	public List<HyRole> findAll();

	public List<HyRole> findByCondition(HyRoleQuery query);

	public Page findPage(HyRoleQuery query);
	
	public void save(HyRole hyRole);
	
	public HyRole findById(Integer id);
	
	public void update(HyRole hyRole);
	
	public void deleteById(Integer id);
}
