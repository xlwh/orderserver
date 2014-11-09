/**  
* @Project: orderserver
* @Title: VegeInfoDaoImpl.java
* @Package com.zhang.dao.product.impl
* @Description: 产品信息持久化对象持久化层操作
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-9 上午8:41:51
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.dao.impl.product;

import java.util.List;

import com.zhang.base.impl.dao.DaoSupport;
import com.zhang.beans.product.VegeInfo;
import com.zhang.dao.product.IVegeInfoDao;

/**
 * @ClassName VegeInfoDaoImpl
 * @Description 产品信息持久化对象持久化层操作
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */
public class VegeInfoDaoImpl extends DaoSupport implements IVegeInfoDao{

	/** 
	 * <p>Title: findByName</p> 
	 * <p>Description: </p> 
	 * @param name
	 * @return 
	 * @see com.zhang.dao.product.IVegeInfoDao#findByName(java.lang.String) 
	*/
	@Override
	public List<VegeInfo> findByName(String name) {
		return null;
	}

	/** 
	 * <p>Title: findByNumDesc</p> 
	 * <p>Description: </p> 
	 * @param firstResult
	 * @param maxReult
	 * @return 
	 * @see com.zhang.dao.product.IVegeInfoDao#findByNumDesc(int, int) 
	*/
	@Override
	public List<VegeInfo> findByNumDesc(int firstResult, int maxReult) {
		return null;
	}

}
