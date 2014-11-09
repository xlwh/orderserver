/**  
* @Project: orderserver
* @Title: TestSupport.java
* @Package com.zhang.base.test
* @Description: TODO
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-6 ÏÂÎç9:46:25
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.base.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestSupport
 * @Description TODO
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-6
 */
public class TestSupport {
	protected static ClassPathXmlApplicationContext ctx;
	
	static{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public static ClassPathXmlApplicationContext getContext(){
		return ctx;
	}

}
