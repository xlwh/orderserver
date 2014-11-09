/**  
* @Project: orderserver
* @Title: VegeInfo.java
* @Package com.zhang.dao.product
* @Description: 菜品信息持久化对象
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-8 下午10:45:42
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.dao.product;

import java.util.List;

import com.zhang.base.dao.DAO;
import com.zhang.beans.product.VegeInfo;

/**
 * @ClassName VegeInfo
 * @Description 菜品信息持久化层访问接口
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-8
 */
public interface IVegeInfoDao extends DAO{
	/**
	 * 
	 * @Title: findByName 
	 * @Description: 通过菜名来获取菜品的持久化对象
	 */
	public List<VegeInfo> findByName(String name);
	/**
	 * 
	 * @Title: findByNumDesc 
	 * @Description: 通过菜品剩余数量由大到小分页获取持久化对象
	 */
	public List<VegeInfo> findByNumDesc(int firstResult,int maxReult);
	
	
	
}
