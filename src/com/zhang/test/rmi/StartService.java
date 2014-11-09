package com.zhang.test.rmi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartService {

	/** 
	 * @Title: main 
	 * @Description: TODO
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml");
		Object obj = new Object();
		System.out.println("服务器启动");
		synchronized (obj){
			try {
				obj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
