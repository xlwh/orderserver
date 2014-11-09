package com.zhang.base.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.zhang.base.utils.Page;

@Component
public interface DAO {
	/**
	 * 
	 * @Title: save 
	 * @Description: �־û���������
	 */
	public <T> void save(T obj);
	/**
	 * 
	 * @Title: save 
	 * @Description: �����־û�����
	 */
	public <T> void save(List<T> list);
	/**
	 * 
	 * @Title: remove 
	 * @Description: ɾ���־û�����
	 */
	public <T> void remove(T obj);
	/**
	 * 
	 * @Title: remove 
	 * @Description: ����ɾ���־û�����
	 */
	public <T> void remove(List<T> list);
	/**
	 * 
	 * @Title: update 
	 * @Description: ���³־û�����
	 */
	public <T> void update(T obj);
	/**
	 * 
	 * @Title: update 
	 * @Description: �������³־û�����
	 */
	public <T> void update(List<T> list);
	/**
	 * 
	 * @Title: query 
	 * @Description: ͨ����������һ���־û�����
	 */
	public <T> T query(Class<T> t,int id);
	
	/**
	 * 
	 * @Title: queryByPage 
	 * @Description: ��ҳ��ȡ�־û�����
	 */
	public <T> Page<T> queryByPage(String hql,Page<T> page);
}
