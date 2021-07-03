package com.jp.ht.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.jp.ht.vo.HyRole;

import cn.org.rapid_framework.page.Page;
import common.dwz.DwzPageQuery;

@Repository
public class HyRoleDao extends BaseIbatisDAO<HyRole,Integer>{

	@Override
	public List<HyRole> findAll() throws DataAccessException {
		return super.findAll();
	}

	@Override
	public List<HyRole> findByCondition(DwzPageQuery query) {
		return super.findByCondition(query);
	}
	
	public Page findPage(DwzPageQuery query) {
		return pageQuery("HyRole.findPage",query);
	}
	
	@Override
	public String getIbatisSqlMapNamespace() {
		return "HyRole";
	}

	@Override
	public void save(HyRole hyRole) throws DataAccessException {
		super.save(hyRole);
	}

	
	@Override
	public void update(HyRole hyRole) throws DataAccessException {
		super.update(hyRole);
	}

	@Override
	public Object getById(Integer id) throws DataAccessException {
		return super.getById(id);
	}

	@Override
	public void deleteById(Integer id) throws DataAccessException {
		super.deleteById(id);
	}
	
	
	
}
