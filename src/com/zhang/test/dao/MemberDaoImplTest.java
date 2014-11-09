/**  
* @Project: orderserver
* @Title: MemberDaoImplTest.java
* @Package com.zhang.test.dao
* @Description: 会员信息持久层测试
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-7 上午10:37:01
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.test.dao;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.zhang.base.test.TestSupport;
import com.zhang.base.utils.Page;
import com.zhang.beans.users.MemberInfo;
import com.zhang.dao.impl.users.MemberDaoImpl;
import com.zhang.dao.users.IMemberDao;

/**
 * @ClassName MemberDaoImplTest
 * @Description 数据库持久层访问测试
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-7
 */
public class MemberDaoImplTest extends TestSupport{

	/**
	 * Test method for {@link com.zhang.dao.impl.users.MemberDaoImpl#getCount()}.
	 */
	
	
	public void testGetCount() {
		IMemberDao dao = (IMemberDao)getContext().getBean("iMemberDao");
		long sum = dao.getCount();
		System.out.println("总记录数目是："+sum);
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#save(java.lang.Object)}.
	 */
	
	public void testSaveT() {
		MemberInfo member = new MemberInfo();
		member.setTrueName("张洪斌");
		member.setAddress("南京邮电大学");
		member.setEmail("1079039435@qq.com");
		member.setLevel(2);
		member.setMailCode("651603");
		member.setNumber("xlwh");
		member.setPassword("xlwhzhb1898784");
		member.setPhone("18951899340");
		member.setQq("1079039435");
		member.setState(1);
		member.setUserName("雪落无痕");
		member.setRegisterTime(new Date());
		IMemberDao dao = (IMemberDao)getContext().getBean("iMemberDao");
		dao.save(member);
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#save(java.util.List)}.
	 */
	
	public void testSaveListOfT() {
		List<MemberInfo> list = new ArrayList<MemberInfo>();
		for(int i=0;i<10000;i++){
			MemberInfo member = new MemberInfo();
			member.setTrueName("张洪斌");
			member.setAddress("南京邮电大学");
			member.setEmail("1079039435@qq.com");
			member.setLevel(2);
			member.setMailCode("651603");
			member.setNumber("xlwh");
			member.setPassword("xlwhzhb1898784");
			member.setPhone("18951899340");
			member.setQq("1079039435");
			member.setState(1);
			member.setUserName("雪落无痕");
			member.setRegisterTime(new Date());
			list.add(member);
		}
		
		IMemberDao dao = (IMemberDao)getContext().getBean("iMemberDao");
		long i = System.currentTimeMillis();
		dao.save(list);
		long j = System.currentTimeMillis();
		System.out.println("数据持久化执行完毕,用时："+(j-i));
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#remove(java.lang.Object)}.
	 */
	
	public void testRemoveT() {
		MemberInfo member = new MemberInfo();
		member.setTrueName("张洪斌");
		member.setAddress("南京邮电大学");
		member.setEmail("1079039435@qq.com");
		member.setLevel(2);
		member.setMailCode("651603");
		member.setNumber("xlwh");
		member.setPassword("xlwhzhb1898784");
		member.setPhone("18951899340");
		member.setQq("1079039435");
		member.setState(1);
		member.setUserName("雪落无痕");
		member.setRegisterTime(new Date());
		IMemberDao dao = (IMemberDao)getContext().getBean("iMemberDao");
		dao.remove(member);
		
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#remove(java.util.List)}.
	 */
	
	public void testRemoveListOfT() {
		
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#update(java.lang.Object)}.
	 */
	
	public void testUpdateT() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#update(java.util.List)}.
	 */

	public void testUpdateListOfT() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#query(java.lang.Class, int)}.
	 */
	
	public void testQuery() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.zhang.base.impl.dao.DaoSupport#queryByPage(java.lang.Object, com.zhang.base.utils.Page)}.
	 */
	
	public void testQueryByPage() {
		IMemberDao dao = (IMemberDao)getContext().getBean("iMemberDao");
		Page<MemberInfo> page = new Page<MemberInfo>();
		page.setFirstResult(1000);
		page.setPageSize(120);
		Page<MemberInfo> list = dao.queryByPage("from MemberInfo", page);
		System.out.println("分页获取的数据记录："+list.getList().size());
	}
	
	
	@SuppressWarnings( "unused")
	public void testFindAll(){
		IMemberDao dao = (IMemberDao)getContext().getBean("iMemberDao");
		long i = System.currentTimeMillis();
		List<MemberInfo> list = dao.getAll();
		long j = System.currentTimeMillis();
		System.out.println("总记录："+list.size()+"查询用时："+(j-i));
		
		long k = System.currentTimeMillis();
		List<MemberInfo> l= dao.getAll();
		long m = System.currentTimeMillis();
		System.out.println("总记录："+list.size()+"查询用时："+(m-k));
	}
	
	
	public void testFindByName(){
		MemberDaoImpl im = (MemberDaoImpl)getContext().getBean("memberDaoImpl");
	    List<MemberInfo> list  = im.getByName("雪落无痕");
	    System.out.println("昵称相同的人有："+list.size());
	}
	
	
	public void testGetByLevel(){
		MemberDaoImpl im = (MemberDaoImpl)getContext().getBean("memberDaoImpl");
		List<MemberInfo> list = im.getByLevel(1, 3);
		System.out.println("会员等级在2和3之间的会员数为："+list.size());
	}
	
	@Test
	public void testGetByTrueName(){
		MemberDaoImpl im = (MemberDaoImpl)getContext().getBean("memberDaoImpl");
		List<MemberInfo> list = im.getByTrueName("张洪斌");
		System.out.println("名字叫张洪斌的人有："+list.size());
	}

}
