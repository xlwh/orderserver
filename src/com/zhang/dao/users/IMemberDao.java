/**  
* @Project: orderserver
* @Title: MemberDao.java
* @Package com.zhang.user.dao
* @Description: ��Ա�־û���ӿ�
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-7 ����9:55:49
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
 * @Description ��Ա�־û���ӿ�
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-7
 */

@Repository
public interface IMemberDao extends DAO {
	/**
	 * 
	 * @Title: getCount 
	 * @Description: ��ȡ�ܼ�¼��Ŀ
	 */
	public long getCount();
	/**
	 * 
	 * @Title: getAll 
	 * @Description: ��ѯ���м�¼
	 */
	public List<MemberInfo> getAll();
	
	/**
	 * 
	 * @Title: getByName 
	 * @Description: ͨ�����ֻ�ȡ�־û�����
	 */
	public List<MemberInfo> getByName(String name);
	
	/**
	 * 
	 * @Title: getByNumber 
	 * @Description: ͨ���˺Ż�ȡ�־û�����
	 */
	public List<MemberInfo> getByNumber(String number);
	/**
	 * 
	 * @Title: getByLevel 
	 * @Description: ��ȡ�ȼ�Ϊn�Ļ�Ա����
	 */
	public List<MemberInfo> getByLevel(int level);
	
	/**
	 * 
	 * @Title: getByLevel 
	 * @Description: ��ȡĳ������Ļ�Ա�־û�����
	 */
	public List<MemberInfo> getByLevel(int min,int max);
	/**
	 * 
	 * @Title: getByMailCode 
	 * @Description: ͨ���ʱ��ȡ��Ա��Ϣ
	 */
	public List<MemberInfo> getByMailCode(String code);
	/**
	 * 
	 * @Title: getByPhone 
	 * @Description: ͨ���绰��ȡ��Ա�־û�����
	 */
	public List<MemberInfo> getByPhone(String phone);
	/**
	 * 
	 * @Title: getByQQ 
	 * @Description: ͨ��QQ��ȡ��Ա�־û�����
	 */
	public List<MemberInfo> getByQQ(String qq); 
	
	/**
	 * 
	 * @Title: getByRegisterTime 
	 * @Description: ��ȡĳ��ע��Ļ�Ա��
	 */
	public List<MemberInfo> getByRegisterTime(Date date);
	/**
	 * 
	 * @Title: getByRegisterTime 
	 * @Description: ��ȡĳ��ʱ����ע��Ļ�Ա��Ϣ
	 */
	public List<MemberInfo> getByRegisterTime(Date min,Date max);
	
	/**
	 * 
	 * @Title: getByState 
	 * @Description: ��ȡĳ��״̬�Ļ�Ա����Ϣ
	 */
	public List<MemberInfo> getByState(int state);
	/**
	 * 
	 * @Title: getByTrueName 
	 * @Description: ͨ����Ա��ʵ������ȡ��Ա�־û�����
	 */
	public List<MemberInfo> getByTrueName(String trueName);
}
