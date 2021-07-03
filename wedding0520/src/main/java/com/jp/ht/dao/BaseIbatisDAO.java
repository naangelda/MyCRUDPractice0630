package com.jp.ht.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.util.MapAndObject;
import cn.org.rapid_framework.util.page.PageQuery;
import common.base.EntityDao;
import common.dwz.DwzPageQuery;

public abstract class BaseIbatisDAO<E, PK extends Serializable> extends SqlMapClientDaoSupport implements EntityDao<E, PK> {
	protected final Log log = LogFactory.getLog(getClass());
	@Override
	public void save(E entity) throws DataAccessException {
		log.info("BaseIbatisDao---save--start.");
		getSqlMapClientTemplate().insert(getInsertStatement(),entity);
	}

	@Override
	public void deleteById(PK id) throws DataAccessException {
		log.info("BaseIbatisDao---delete--start.");
		getSqlMapClientTemplate().delete(getDeleteByIdStatement(), id);
	}
	

	@Override
	public void deleteByIds(Map<String, Object> params) {
		getSqlMapClientTemplate().delete(getDeleteByIdsStatement(), params);
	}

	@Override
	public void update(E entity) throws DataAccessException {
		log.info("BaseIbatisDao---update--start.");
		getSqlMapClientTemplate().update(getUpdateStatement(),entity);
	}

	@Override
	public void saveOrUpdate(E entity) throws DataAccessException {
		
	}

	@Override
	public Object getById(PK id) throws DataAccessException {
		return getSqlMapClientTemplate().queryForObject(getFindByPKStatement(),id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> findAll() throws DataAccessException {
		log.info("BaseIbatisDao---findAll--start.");
		return getSqlMapClientTemplate().queryForList(getFindAllStatement());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<E> findByCondition(DwzPageQuery query){
		log.info("BaseIbatisDao---findByCondition--start.");
		return getSqlMapClientTemplate().queryForList(getFindByConditionStatement(),query);
	}

	@Override
	public boolean isUnique(E entity, String... uniquePropertyNames) throws DataAccessException {
		return false;
	}
	//为了子类去覆盖实现功能
	public String getIbatisSqlMapNamespace() {
		throw new RuntimeException("not yet implement");
	}
	// student.insert----> sqlmap/mapper.xml: <insert id=  "">
	public String getInsertStatement() {
		
		return getIbatisSqlMapNamespace()+".insert";
	}
	
	public String getUpdateStatement() {
		
		return getIbatisSqlMapNamespace()+".update";
	}
	
	public String getDeleteByIdStatement() {
		return getIbatisSqlMapNamespace()+".deleteById";
	}
	
	public String getDeleteByIdsStatement() {
		return getIbatisSqlMapNamespace()+".deleteByIds";
	}
	
	public String getFindByPKStatement() {
		return getIbatisSqlMapNamespace()+".findById";
	}
	public String getFindAllStatement() {
		return getIbatisSqlMapNamespace()+".findAll";
	}
	
	public String getFindByConditionStatement() {

		return getIbatisSqlMapNamespace()+".findByCondition";
	}

	@Override
	public Page pageQuery(String statementName,DwzPageQuery pageQuery) {
		return pageQuery(getSqlMapClientTemplate(),statementName,getCountStatementForPaging(statementName),pageQuery);
	}
	
	public static Page pageQuery(SqlMapClientTemplate sqlMapClientTemplate,
			String statementName,String countStatementName,PageQuery pageQuery) {
		Number totalCount = (Number) sqlMapClientTemplate.queryForObject(countStatementName,pageQuery);
		if(totalCount == null || totalCount.longValue() <= 0) {
			return new Page(pageQuery,0);
		}
		
		Page page = new Page(pageQuery,totalCount.intValue());
		
		Map<String,Object> otherFilters = new HashMap<String,Object>();
		otherFilters.put("offset", page.getFirstResult());
		otherFilters.put("pageSize", page.getPageSize());
		otherFilters.put("lastRows", page.getFirstResult() + page.getPageSize());
		
		pageQuery.setPage(page.getThisPageNumber());
		
		Map parameterObject = new MapAndObject(otherFilters,pageQuery);
		List list = sqlMapClientTemplate.queryForList(statementName, parameterObject,page.getFirstResult(),page.getPageSize());
		page.setResult(list);
		return page;
	}
	
	public String getCountStatementForPaging(String statementName) {
		return statementName+".count";
	}
}
