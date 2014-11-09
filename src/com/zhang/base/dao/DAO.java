package com.zhang.base.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.zhang.base.utils.Page;

@Component
public interface DAO {
	/**
	 * 
	 * @Title: save 
	 * @Description: 持久化单个对象
	 */
	public <T> void save(T obj);
	/**
	 * 
	 * @Title: save 
	 * @Description: 批量持久化对象
	 */
	public <T> void save(List<T> list);
	/**
	 * 
	 * @Title: remove 
	 * @Description: 删除持久化对象
	 */
	public <T> void remove(T obj);
	/**
	 * 
	 * @Title: remove 
	 * @Description: 批量删除持久化对象
	 */
	public <T> void remove(List<T> list);
	/**
	 * 
	 * @Title: update 
	 * @Description: 更新持久化对象
	 */
	public <T> void update(T obj);
	/**
	 * 
	 * @Title: update 
	 * @Description: 批量更新持久化对象
	 */
	public <T> void update(List<T> list);
	/**
	 * 
	 * @Title: query 
	 * @Description: 通过主键查找一个持久化对象
	 */
	public <T> T query(Class<T> t,int id);
	
	/**
	 * 
	 * @Title: queryByPage 
	 * @Description: 分页获取持久化对象
	 */
	public <T> Page<T> queryByPage(String hql,Page<T> page);
}
