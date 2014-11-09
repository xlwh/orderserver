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
	 *  �־û�����</p> 
	 * @param obj  ������Ķ���
	 * @return    �����Ƿ�ɹ�
	 * @see com.zhang.base.dao.DAO#save(java.lang.Object)
	*/
	@Override
	public <T> void save(T obj) {
		if( obj != null && hibernateTemplate != null){
			hibernateTemplate.save(obj);
		  }else{
			throw new NullArgumentException("�ղ����쳣��com.zhang.base.dao.DaoSupport#save()");
		}
		
	}
	
	/**
	 * 
	 * <p>Title: save</p> 
	 * <p>Description:����ִ�����ݳ־û� </p> 
	 * @param list  Ҫִ�������־û�������
	 * @return      ִ�н��
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
	 * <p>Description: ɾ�����ݿ��е�����</p> 
	 * @param obj       ��Ҫɾ�����Ѿ��־û��Ķ���
	 * @see com.zhang.base.dao.DAO#remove(java.lang.Object)
	 */
	@Override
	public <T> void remove(T obj) {
		if( obj != null){
			hibernateTemplate.delete(obj);
		}else{
			throw new NullArgumentException("�ղ����쳣��com.zhang.base.dao.impl.DaoSupport#remove");
		}
		
	}

	/**
	 * 
	 * <p>Title: remove</p> 
	 * <p>Description: ����ɾ������</p> 
	 * @param list     ��Ҫ������ɾ��������
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
	 * <p>Description: ���³־û�����</p> 
	 * @param obj      �ȴ����µ�����
	 * @see com.zhang.base.dao.DAO#update(java.lang.Object)
	 */
	@Override
	public <T> void update(T obj) {
		if( obj != null){
			hibernateTemplate.update(obj);
		}else{
			throw new NullArgumentException("�ղ����쳣��com.zhang.base.dao.impl.DaoSupport#update");
		}
	}

	/**
	 * 
	 * <p>Title: update</p> 
	 * <p>Description:�������³־û����� </p> 
	 * @param list    �ȴ����µĳ־û�����
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
	 * <p>Description: ����������ȡ�־û�����</p> 
	 * @param id       Ҫ��ȡ�����ݵ�ID
	 * @return         ���ҵ�������
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
	 * <p>Description:���ݴ����ҳ��ȡ������
	 * HibernateTemplate��ȡ����Ҫ����Ĳ����ж���ģ��
	 * ���䣨��һ����¼��ʼ�������һ����¼��ʼ����
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
