/**  
* @Project: orderserver
* @Title: DaoSupportTest.java
* @Package com.zhang.test.dao
* @Description: ���������ݿ���ʹ��߲���
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-6 ����9:43:11
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.test.dao;

import java.util.ArrayList;
import java.util.List;

import com.zhang.base.dao.DAO;
import com.zhang.base.test.TestSupport;
import com.zhang.beans.users.MemberInfo;

/**
 * @ClassName DaoSupportTest
 * @Description ���ݿ���ʹ��߹������๤�ߵ�Ԫ����
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-6
 */
public class DaoSupportTest extends TestSupport{
	
	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#save(java.lang.Object)}.
	 */
	
	@SuppressWarnings( "static-access")
	public void testSaveT() {
		MemberInfo info = new MemberInfo();
		info.setUserName("����");
	    DAO dao = (DAO)this.ctx.getBean("dAO");
	    dao.save(info);
	    
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#save(java.util.List)}.
	 */
	
	@SuppressWarnings( "static-access")
	public void testSaveListOfT() {
		List<MemberInfo> list = new ArrayList<MemberInfo>();
		for(int i=0;i<100;i++){
			MemberInfo member = new MemberInfo();
			member.setUserName("����");
			list.add(member);
		}
		
		DAO dao = (DAO)this.ctx.getBean("dAO");
		dao.save(list);
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#remove(java.lang.Object)}.
	 */
	
	public void testRemoveT() {
		MemberInfo info = null;
		DAO dao = (DAO)ctx.getBean("dAO");
		info = dao.query(MemberInfo.class, 1);
		if(info == null){
			System.out.println("û�в�ѯ������");
		}else{
			//System.out.println("��ѯ�����ݣ�����ɾ��");
			dao.remove(info);
		}
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#remove(java.util.List)}.
	 */
	

	public void testRemoveListOfT() {
		List<MemberInfo> list = new ArrayList<MemberInfo>();
		DAO dao = (DAO)ctx.getBean("dAO");
		for(int i=2;i<200;i++){
			MemberInfo member = dao.query(MemberInfo.class, i);
			list.add(member);
		}
		dao.remove(list);
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#update(java.lang.Object)}.
	 */
	
	
	public void testUpdateT() {
		DAO dao = (DAO)ctx.getBean("dAO");
		MemberInfo info = dao.query(MemberInfo.class, 2);
		if(info != null){
			info.setUserName("��������");
			dao.update(info);
		}
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#update(java.util.List)}.
	 */

	
	public void testUpdateListOfT() {
		List<MemberInfo> list = new ArrayList<MemberInfo>();
		DAO dao = (DAO)ctx.getBean("dAO");
		for(int i=2;i<200;i++){
			MemberInfo member = dao.query(MemberInfo.class, i);
			member.setUserName("��������");
			list.add(member);
		}
		dao.update(list);
		
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#query(int)}.
	 */

	
	public void testQuery() {
		DAO dao = (DAO)ctx.getBean("dAO");
		MemberInfo member = dao.query(MemberInfo.class, 10);
		System.out.println(member.getUserName());
	}

}
