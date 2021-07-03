package common.base;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;
/**
 * @author badqiu
 * @since 4.0 
 */
@SuppressWarnings(value = "all")
@Transactional
public abstract class BaseManager <E,PK extends Serializable>{
	
	protected Log log = LogFactory.getLog(getClass());

	protected abstract EntityDao getEntityDao();

	@Transactional(readOnly=true)
	public E getById(PK id) throws DataAccessException{
		return (E)getEntityDao().getById(id);
	}
	
	@Transactional(readOnly=true)
	public List<E> findAll() throws DataAccessException{
		return getEntityDao().findAll();
	}
	
	/** 譬ｹ謐ｮid譽�譟･譏ｯ蜷ｦ謠貞�･謌匁弍譖ｴ譁ｰ謨ｰ謐ｮ */
	public void saveOrUpdate(E entity) throws DataAccessException{
		getEntityDao().saveOrUpdate(entity);
	}
	
	public void update(E entity) throws DataAccessException{
		getEntityDao().update(entity);
	}
	
	
	
	/** 謠貞�･謨ｰ謐ｮ */
	public void save(E entity) throws DataAccessException{
		getEntityDao().save(entity);
	}
	
	public void removeById(PK id) throws DataAccessException{
		getEntityDao().deleteById(id);
	}
	
	
	@Transactional(readOnly=true)
	public boolean isUnique(E entity, String uniquePropertyNames) throws DataAccessException {
		return getEntityDao().isUnique(entity, uniquePropertyNames);
	}
	
}
