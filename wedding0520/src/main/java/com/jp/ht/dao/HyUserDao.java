package com.jp.ht.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.jp.ht.query.HyUserQuery;
import com.jp.ht.vo.HyUser;

import cn.org.rapid_framework.page.Page;
import common.dwz.DwzPageQuery;

@Repository
public class HyUserDao extends BaseIbatisDAO<HyUser, java.lang.Integer> {
	
	
	@Override
	public void save(HyUser user) throws DataAccessException {
		super.save(user);
	}

	@Override
	public void deleteById(Integer id) throws DataAccessException {
		super.deleteById(id);
	}
	

	@Override
	public void deleteByIds(Map<String, Object> params) {
		super.deleteByIds(params);
	}

	@Override
	public void update(HyUser user) throws DataAccessException {
		super.update(user);
	}

	@Override
	public void saveOrUpdate(HyUser user) throws DataAccessException {
		super.saveOrUpdate(user);
	}

	@Override
	public Object getById(Integer id) throws DataAccessException {
		return super.getById(id);
	}

	@Override
	public List<HyUser> findAll() throws DataAccessException {
		return super.findAll();
	}

	@Override
	public boolean isUnique(HyUser user, String... uniquePropertyNames) throws DataAccessException {
		return super.isUnique(user, uniquePropertyNames);
	}

	@Override
	public String getIbatisSqlMapNamespace() {
		return "HyUser";
	}
	
	public Page findPage(HyUserQuery query) {
		return  pageQuery("HyUser.findPage",query);
	}

	@Override
	public List<HyUser> findByCondition(DwzPageQuery query) {
		return  super.findByCondition(query);
	}
	
}
