package com.jp.ht.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.jp.ht.vo.Tmenu;

import common.dwz.DwzPageQuery;

@Repository
public class TmenuDao extends BaseIbatisDAO<Tmenu, java.lang.Integer> {

	@Override
	public void save(Tmenu entity) throws DataAccessException {
		super.save(entity);
	}

	@Override
	public void deleteById(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}
	
	
	@Override
	public void deleteByIds(Map<String, Object> params) {
		// TODO Auto-generated method stub
		super.deleteByIds(params);
	}

	@Override
	public void update(Tmenu entity) throws DataAccessException {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public void saveOrUpdate(Tmenu entity) throws DataAccessException {
		// TODO Auto-generated method stub
		super.saveOrUpdate(entity);
	}

	@Override
	public Object getById(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public List<Tmenu> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public List<Tmenu> findByCondition(DwzPageQuery query) {
		// TODO Auto-generated method stub
		return super.findByCondition(query);
	}


	@Override
	public String getIbatisSqlMapNamespace() {
		// TODO Auto-generated method stub
		return "Tmenu";
	}
	
	
}
