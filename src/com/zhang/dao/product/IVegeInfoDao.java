/**  
* @Project: orderserver
* @Title: VegeInfo.java
* @Package com.zhang.dao.product
* @Description: ��Ʒ��Ϣ�־û�����
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-8 ����10:45:42
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.dao.product;

import java.util.List;

import com.zhang.base.dao.DAO;
import com.zhang.beans.product.VegeInfo;

/**
 * @ClassName VegeInfo
 * @Description ��Ʒ��Ϣ�־û�����ʽӿ�
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-8
 */
public interface IVegeInfoDao extends DAO{
	/**
	 * 
	 * @Title: findByName 
	 * @Description: ͨ����������ȡ��Ʒ�ĳ־û�����
	 */
	public List<VegeInfo> findByName(String name);
	/**
	 * 
	 * @Title: findByNumDesc 
	 * @Description: ͨ����Ʒʣ�������ɴ�С��ҳ��ȡ�־û�����
	 */
	public List<VegeInfo> findByNumDesc(int firstResult,int maxReult);
	
	
	
}
