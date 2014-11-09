package com.zhang.test.rmi;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.zhang.base.dao.DAO;
import com.zhang.beans.users.MemberInfo;

public class TestHibernate {

	/** 
	 * @Title: main 
	 * @Description: TODO
	 * @param @param args    �趨�ļ� 
	 * @return void    �������� 
	 * @throws 
	 */
	@SuppressWarnings( "unused")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    MemberInfo info = new MemberInfo();
	    info.setUserName("�ź��");
	    HibernateTemplate  util = (HibernateTemplate)ctx.getBean("hibernateTemplate");
	    DAO dao = (DAO)ctx.getBean("dAO");
	    dao.save(info);
	    System.out.println("����ɹ�");
	}

}
