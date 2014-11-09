/**  
* @Project: orderserver
* @Title: TestVegeType.java
* @Package com.zhang.test.dao
* @Description: TODO
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-7 ÏÂÎç10:31:41
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.test.dao;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestVegeType
 * @Description TODO
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-7
 */
public class TestVegeType {
	@Test
	public void testInit(){
		@SuppressWarnings( "unused")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		  System.out.println("¼ì²â³É¹¦");
		
	}
}
