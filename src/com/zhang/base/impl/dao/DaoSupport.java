package com.zhang.base.impl.dao;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.NullArgumentException;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zhang.base.dao.DAO;
import com.zhang.base.utils.Page;

@Repository
public class DaoSupport implements DAO{
	
	@Resource
	private HibernateTemplate hibernateTemplate;
	/**
	 * 
	 * <p>Title: save</p> 
	 * <p>Description:
	 *  持久化对象</p> 
	 * @param obj  待保存的对象
	 * @return    保存是否成功
	 * @see com.zhang.base.dao.DAO#save(java.lang.Object)
	*/
	@Override
	public <T> void save(T obj) {
		if( obj != null && hibernateTemplate != null){
			hibernateTemplate.save(obj);
		  }else{
			throw new NullArgumentException("空参数异常：com.zhang.base.dao.DaoSupport#save()");
		}
		
	}
	
	/**
	 * 
	 * <p>Title: save</p> 
	 * <p>Description:批量执行数据持久化 </p> 
	 * @param list  要执行批量持久化的数据
	 * @return      执行结果
	 * @see com.zhang.base.dao.DAO#save(java.util.List)
	 */
	@Override
	public <T> void save(List<T> list) {
		/*for(T entity : list){
			hibernateTemplate.save(entity);
		}*/
		hibernateTemplate.saveOrUpdateAll(list);
		
	}
	
	/**
	 * 
	 * <p>Title: remove</p> 
	 * <p>Description: 删除数据库中的数据</p> 
	 * @param obj       需要删除的已经持久化的对象
	 * @see com.zhang.base.dao.DAO#remove(java.lang.Object)
	 */
	@Override
	public <T> void remove(T obj) {
		if( obj != null){
			hibernateTemplate.delete(obj);
		}else{
			throw new NullArgumentException("空参数异常：com.zhang.base.dao.impl.DaoSupport#remove");
		}
		
	}

	/**
	 * 
	 * <p>Title: remove</p> 
	 * <p>Description: 批量删除数据</p> 
	 * @param list     需要被批量删除的数据
	 * @see com.zhang.base.dao.DAO#remove(java.util.List)
	 */
	@Override
	public <T> void remove(List<T> list) {
		for(T entity : list){
			hibernateTemplate.delete(entity);
		}
	}

	/**
	 * 
	 * <p>Title: update</p> 
	 * <p>Description: 更新持久化数据</p> 
	 * @param obj      等待更新的数据
	 * @see com.zhang.base.dao.DAO#update(java.lang.Object)
	 */
	@Override
	public <T> void update(T obj) {
		if( obj != null){
			hibernateTemplate.update(obj);
		}else{
			throw new NullArgumentException("空参数异常：com.zhang.base.dao.impl.DaoSupport#update");
		}
	}

	/**
	 * 
	 * <p>Title: update</p> 
	 * <p>Description:批量更新持久化数据 </p> 
	 * @param list    等待更新的持久化数据
	 * @see com.zhang.base.dao.DAO#update(java.util.List)
	 */
	@Override
	public <T> void update(List<T> list) {
		for(T entity : list){
			hibernateTemplate.update(entity);
		}
	}

	/**
	 * 
	 * <p>Title: query</p> 
	 * <p>Description: 根据主键获取持久化数据</p> 
	 * @param id       要获取的数据的ID
	 * @return         查找到的数据
	 * @see com.zhang.base.dao.DAO#query(int)
	 */
	@SuppressWarnings( "unchecked")
	@Override
	public <T> T query(Class<T> obj, int id) {
		T t = null;
		t = (T) hibernateTemplate.get(obj.getName(), id);
		return t;
	}

	/** 
	 * <p>Title: queryByPage</p> 
	 * <p>Description:根据传入的页面取得数据
	 * HibernateTemplate获取数据要求传入的参数有对象模型
	 * 区间（第一条记录开始处和最后一条记录开始处）
	 * 
	 * </p> 
	 * @param page
	 * @return 
	 * @see com.zhang.base.dao.DAO#queryByPage(com.zhang.base.utils.Page) 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public <T> Page<T> queryByPage(final String hql,final Page<T> page) {
		List<T> list = null;
		if(hibernateTemplate != null){
			list = hibernateTemplate.executeFind(new HibernateCallback<List<T>>(){

				@Override
				public List<T> doInHibernate(Session session)
						throws HibernateException, SQLException {
					Query query = session.createQuery(hql);
					query.setFirstResult(page.getFirstResult());
					query.setMaxResults(page.getPageSize());
					List<T> result = query.list();
					return result;
				}
				
			});
		}
		page.setList(list);
		return page;
	}

	
}
