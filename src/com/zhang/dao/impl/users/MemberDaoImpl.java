/**  
* @Project: orderserver
* @Title: MemberDaoImpl.java
* @Package com.zhang.user.dao.impl
* @Description: 会员数据库访问层操作
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-7 上午10:01:49
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.dao.impl.users;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.zhang.base.impl.dao.DaoSupport;
import com.zhang.beans.users.MemberInfo;
import com.zhang.dao.users.IMemberDao;

/**
 * @ClassName MemberDaoImpl
 * @Description 会员数据库访问层操作
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-7
 */

@Component
public class MemberDaoImpl extends DaoSupport implements IMemberDao{

	@Resource
	HibernateTemplate hibernateTemplate;
	/** 
	 * <p>Title: getCount</p> 
	 * <p>Description: 获取会员总记录</p> 
	 * @return         注册的会员总数
	 * @see com.zhang.dao.users.IMemberDao#getCount() 
	*/
	@Override
	public long getCount() {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		long count = (Long) session.createQuery("select count(*) from T_MEMBERINFO").uniqueResult();
		return count;
	}
	/** 
	 * <p>Title: getAll</p> 
	 * <p>Description: 获取所有持久化对象</p> 
	 * @return 
	 * @see com.zhang.dao.users.IMemberDao#getAll() 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getAll() {
		return hibernateTemplate.find("from MemberInfo");
	}
	/** 
	 * <p>Title: getByName</p> 
	 * <p>Description: 通过昵称来获取会员持久化信息</p> 
	 * @return         所有昵称相同的会员信息
	 * @see com.zhang.dao.users.IMemberDao#getByName() 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getByName(String name) {
		Object value[] = {name};
		return hibernateTemplate.find("from MemberInfo m where m.userName=?", value[0]);
	}
	/** 
	 * <p>Title: getByNumber</p> 
	 * <p>Description:通过账号来获取持久化对象 </p> 
	 * @param number  会员对象
	 * @return        找到的持久化对象
	 * @see com.zhang.dao.users.IMemberDao#getByNumber(java.lang.String) 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getByNumber(String number) {
		Object value[] = {number};
		return hibernateTemplate.find("from MemberInfo m where m.number=?", value[0]);
	}
	/** 
	 * <p>Title: getByLevel</p> 
	 * <p>Description:获取会员某个等级的会员持久化对象 </p> 
	 * @param level   会员等级
	 * @return        获取到的会员持久化对象
	 * @see com.zhang.dao.users.IMemberDao#getByLevel(int) 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getByLevel(int level) {
		Object value[] = {level};
		return hibernateTemplate.find("from MemberInfo m where m.level=?", value[0]);
	}
	
	/** 
	 * <p>Title: getByLevel</p> 
	 * <p>Description:获取某一区间的会员的持久化对象 </p> 
	 * @param min     区间起点
	 * @param max     区间终点
	 * @return        区间内的会员持久化对象
	 * @see com.zhang.dao.users.IMemberDao#getByLevel(int, int) 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getByLevel(int min, int max) {
		Object value[] = {min,max};
		return hibernateTemplate.find("from MemberInfo m where m.level >=? and m.level <= ?", value[0],value[1]);
	}
	/** 
	 * <p>Title: getByMailCode</p> 
	 * <p>Description: 通过邮政编码获取相同邮政编码的会员</p> 
	 * @param code     邮政编码
	 * @return         相同邮政码的持久化对象
	 * @see com.zhang.dao.users.IMemberDao#getByMailCode(java.lang.String) 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getByMailCode(String code) {
		Object value[] = {code};
		return hibernateTemplate.find("from MemberInfo m where m.mailCode=?", value[0]);
	}
	/** 
	 * <p>Title: getByPhone</p> 
	 * <p>Description: 通过电话号码获取持久化对象</p> 
	 * @param phone    会员电话号码
	 * @return         会员持久化对象
	 * @see com.zhang.dao.users.IMemberDao#getByPhone(java.lang.String) 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getByPhone(String phone) {
		Object value[] = {phone};
		return hibernateTemplate.find("from MemberInfo m where m.phone=?", value[0]);
	}
	/** 
	 * <p>Title: getByQQ</p> 
	 * <p>Description: </p> 
	 * @param qq
	 * @return 
	 * @see com.zhang.dao.users.IMemberDao#getByQQ(java.lang.String) 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getByQQ(String qq) {
		Object value[] = {qq};
		return hibernateTemplate.find("from MemberInfo m where m.qq=?", value[0]);
	}
	/** 
	 * <p>Title: getByRegisterTime</p> 
	 * <p>Description: 获取个段时间注册的会员</p> 
	 * @param date     注册时间
	 * @return         会员持久化对象
	 * @see com.zhang.dao.users.IMemberDao#getByRegisterTime(java.util.Date) 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getByRegisterTime(Date date) {
		Object value[] = {date};
		return hibernateTemplate.find("from MemberInfo m where m.registerTime=?", value[0]);
	}
	/** 
	 * <p>Title: getByRegisterTime</p> 
	 * <p>Description: 获取某个时间段的会员持久化对象</p> 
	 * @param min      时间起点
	 * @param max      时间终点
	 * @return         会员信息持久化对象
	 * @see com.zhang.dao.users.IMemberDao#getByRegisterTime(java.util.Date, java.util.Date) 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getByRegisterTime(Date min, Date max) {
		Object value[] = {min,max};
		return hibernateTemplate.find("from MemberInfo m where m.registerTime>=? and m.registerTime<=?", value[0],value[1]);
	}
	/** 
	 * <p>Title: getByState</p> 
	 * <p>Description: 获取某个状态下的会员持久化对象</p> 
	 * @param state    会员在线状态
	 * @return         该状态下的会员持久化对象
	 * @see com.zhang.dao.users.IMemberDao#getByState(int) 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getByState(int state) {
		Object value[] = {state};
		return hibernateTemplate.find("from MemberInfo m where m.state=?", value[0]);
	}
	/** 
	 * <p>Title: getByTrueName</p> 
	 * <p>Description:通过会员真实姓名获取会员持久化对象 </p> 
	 * @param trueName 会员真实姓名
	 * @return         会员持久化对象
	 * @see com.zhang.dao.users.IMemberDao#getByTrueName(java.lang.String) 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getByTrueName(String trueName) {
		Object value[] = {trueName};
		return hibernateTemplate.find("from MemberInfo m where m.trueName=?", value[0]);
	}
	

}
