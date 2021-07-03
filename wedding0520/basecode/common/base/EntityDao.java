package common.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import cn.org.rapid_framework.page.Page;
import common.dwz.DwzPageQuery;
//泛型中的E :Element Object对象/实体类的占位
public interface EntityDao <E,PK extends Serializable>{
	//新增
	public void save(E entity) throws DataAccessException;
	//删除
	public void deleteById(PK id) throws DataAccessException;
	public void deleteByIds(Map<String,Object> params);
	//更新
	public void update(E entity) throws DataAccessException;
	//增加或更新
	public void saveOrUpdate(E entity) throws DataAccessException;
	//查询
	public Object getById(PK id) throws DataAccessException;
	public List<E> findAll() throws DataAccessException;
	public boolean isUnique(E entiry,String ... uniquePropertyNames)throws DataAccessException;
	public Page pageQuery(String statementName,DwzPageQuery pageQuery);
	
	public List<E> findByCondition(DwzPageQuery query);
}
