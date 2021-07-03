package com.jp.ht.service;

import java.util.List;
import java.util.Map;

import com.jp.ht.query.HyUserQuery;
import com.jp.ht.vo.HyUser;

import cn.org.rapid_framework.page.Page;

public interface HyUserIService {
	public void save(HyUser user) ;
	public void deleteByIds(Map<String,Object> params);
	public void update(HyUser user);
	public Page findPage(HyUserQuery query);
	
	public List<HyUser> findByCondition(HyUserQuery query);
	public HyUser findById(Integer id);
	
}
