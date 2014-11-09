/**  
* @Project: orderserver
* @Title: Page.java
* @Package com.zhang.domain
* @Description: ��ҳ����
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-6 ����10:50:28
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.base.utils;

import java.util.List;

/**
 * @ClassName Page
 * @Description ��ҳ����
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @param <T>
 * @date 2014-11-6
 */
public class Page<T> {
	
	/**
	 * ��ǰҳ
	 */
	private int currentPage;
	
	/**
	 * ÿҳ��ʾ��¼��
	 */
	private int pageSize;
	
	/**
	 * ��һҳ
	 */
	private int previousPage;
	
	/**
	 * ��һҳ
	 */
	private int nextPage;
	
	/**
	 * �ܼ�¼��
	 */
	private int sum;
	/**
	 * ��ʼ��¼
	 */
	private int firstResult;
	/**
	 * ���һ����¼
	 */
	private int maxResult;
	
	/**
	 * ÿҳ������
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
