/**  
* @Project: orderserver
* @Title: MemberDao.java
* @Package com.zhang.user.dao
* @Description: 会员持久化层接口
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-7 上午9:55:49
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.dao.users;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhang.base.dao.DAO;
import com.zhang.beans.users.MemberInfo;

/**
 * @ClassName MemberDao
 * @Description 会员持久化层接口
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-7
 */

@Repository
public interface IMemberDao extends DAO {
	/**
	 * 
	 * @Title: getCount 
	 * @Description: 获取总记录数目
	 */
	public long getCount();
	/**
	 * 
	 * @Title: getAll 
	 * @Description: 查询所有记录
	 */
	public List<MemberInfo> getAll();
	
	/**
	 * 
	 * @Title: getByName 
	 * @Description: 通过名字获取持久化对象
	 */
	public List<MemberInfo> getByName(String name);
	
	/**
	 * 
	 * @Title: getByNumber 
	 * @Description: 通过账号获取持久化对象
	 */
	public List<MemberInfo> getByNumber(String number);
	/**
	 * 
	 * @Title: getByLevel 
	 * @Description: 获取等级为n的会员对象
	 */
	public List<MemberInfo> getByLevel(int level);
	
	/**
	 * 
	 * @Title: getByLevel 
	 * @Description: 获取某个区间的会员持久化对象
	 */
	public List<MemberInfo> getByLevel(int min,int max);
	/**
	 * 
	 * @Title: getByMailCode 
	 * @Description: 通过邮编获取会员信息
	 */
	public List<MemberInfo> getByMailCode(String code);
	/**
	 * 
	 * @Title: getByPhone 
	 * @Description: 通过电话获取会员持久化对象
	 */
	public List<MemberInfo> getByPhone(String phone);
	/**
	 * 
	 * @Title: getByQQ 
	 * @Description: 通过QQ获取会员持久化对象
	 */
	public List<MemberInfo> getByQQ(String qq); 
	
	/**
	 * 
	 * @Title: getByRegisterTime 
	 * @Description: 获取某天注册的会员数
	 */
	public List<MemberInfo> getByRegisterTime(Date date);
	/**
	 * 
	 * @Title: getByRegisterTime 
	 * @Description: 获取某段时间里注册的会员信息
	 */
	public List<MemberInfo> getByRegisterTime(Date min,Date max);
	
	/**
	 * 
	 * @Title: getByState 
	 * @Description: 获取某个状态的会员的信息
	 */
	public List<MemberInfo> getByState(int state);
	/**
	 * 
	 * @Title: getByTrueName 
	 * @Description: 通过会员真实姓名获取会员持久化对象
	 */
	public List<MemberInfo> getByTrueName(String trueName);
}
