/**  
* @Project: orderserver
* @Title: MemberDaoImpl.java
* @Package com.zhang.user.dao.impl
* @Description: ��Ա���ݿ���ʲ����
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-7 ����10:01:49
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
 * @Description ��Ա���ݿ���ʲ����
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-7
 */

@Component
public class MemberDaoImpl extends DaoSupport implements IMemberDao{

	@Resource
	HibernateTemplate hibernateTemplate;
	/** 
	 * <p>Title: getCount</p> 
	 * <p>Description: ��ȡ��Ա�ܼ�¼</p> 
	 * @return         ע��Ļ�Ա����
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
	 * <p>Description: ��ȡ���г־û�����</p> 
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
	 * <p>Description: ͨ���ǳ�����ȡ��Ա�־û���Ϣ</p> 
	 * @return         �����ǳ���ͬ�Ļ�Ա��Ϣ
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
	 * <p>Description:ͨ���˺�����ȡ�־û����� </p> 
	 * @param number  ��Ա����
	 * @return        �ҵ��ĳ־û�����
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
	 * <p>Description:��ȡ��Աĳ���ȼ��Ļ�Ա�־û����� </p> 
	 * @param level   ��Ա�ȼ�
	 * @return        ��ȡ���Ļ�Ա�־û�����
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
	 * <p>Description:��ȡĳһ����Ļ�Ա�ĳ־û����� </p> 
	 * @param min     �������
	 * @param max     �����յ�
	 * @return        �����ڵĻ�Ա�־û�����
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
	 * <p>Description: ͨ�����������ȡ��ͬ��������Ļ�Ա</p> 
	 * @param code     ��������
	 * @return         ��ͬ������ĳ־û�����
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
	 * <p>Description: ͨ���绰�����ȡ�־û�����</p> 
	 * @param phone    ��Ա�绰����
	 * @return         ��Ա�־û�����
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
	 * <p>Description: ��ȡ����ʱ��ע��Ļ�Ա</p> 
	 * @param date     ע��ʱ��
	 * @return         ��Ա�־û�����
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
	 * <p>Description: ��ȡĳ��ʱ��εĻ�Ա�־û�����</p> 
	 * @param min      ʱ�����
	 * @param max      ʱ���յ�
	 * @return         ��Ա��Ϣ�־û�����
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
	 * <p>Description: ��ȡĳ��״̬�µĻ�Ա�־û�����</p> 
	 * @param state    ��Ա����״̬
	 * @return         ��״̬�µĻ�Ա�־û�����
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
	 * <p>Description:ͨ����Ա��ʵ������ȡ��Ա�־û����� </p> 
	 * @param trueName ��Ա��ʵ����
	 * @return         ��Ա�־û�����
	 * @see com.zhang.dao.users.IMemberDao#getByTrueName(java.lang.String) 
	*/
	@SuppressWarnings( "unchecked")
	@Override
	public List<MemberInfo> getByTrueName(String trueName) {
		Object value[] = {trueName};
		return hibernateTemplate.find("from MemberInfo m where m.trueName=?", value[0]);
	}
	

}
