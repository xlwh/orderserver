package com.zhang.test.rmi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartService {

	/** 
	 * @Title: main 
	 * @Description: TODO
	 * @param @param args    �趨�ļ� 
	 * @return void    �������� 
	 * @throws 
	 */
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml");
		Object obj = new Object();
		System.out.println("����������");
		synchronized (obj){
			try {
				obj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
