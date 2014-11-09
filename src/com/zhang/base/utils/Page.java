/**  
* @Project: orderserver
* @Title: Page.java
* @Package com.zhang.domain
* @Description: 分页对象
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-6 下午10:50:28
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.base.utils;

import java.util.List;

/**
 * @ClassName Page
 * @Description 分页对象
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @param <T>
 * @date 2014-11-6
 */
public class Page<T> {
	
	/**
	 * 当前页
	 */
	private int currentPage;
	
	/**
	 * 每页显示记录数
	 */
	private int pageSize;
	
	/**
	 * 上一页
	 */
	private int previousPage;
	
	/**
	 * 下一页
	 */
	private int nextPage;
	
	/**
	 * 总记录数
	 */
	private int sum;
	/**
	 * 开始记录
	 */
	private int firstResult;
	/**
	 * 最后一条记录
	 */
	private int maxResult;
	
	/**
	 * 每页的内容
	 */
	private List<T> list;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPreviousPage() {
		return previousPage;
	}

	public void setPreviousPage(int previousPage) {
		this.previousPage = previousPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public int getFirstResult() {
		return firstResult;
	}

	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}

	public int getMaxResult() {
		return maxResult;
	}

	public void setMaxResult(int maxResult) {
		this.maxResult = maxResult;
	}
	
}
