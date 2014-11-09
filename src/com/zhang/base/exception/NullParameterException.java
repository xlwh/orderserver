/**  
* @Project: orderserver
* @Title: NullParameterException.java
* @Package com.zhang.base.exception
* @Description: ��������Ϊ���쳣
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-6 ����9:18:55
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.base.exception;

/**
 * @ClassName NullParameterException
 * @Description �ղ����쳣
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-6
 */
public class NullParameterException extends Exception{

	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 1L;
	
	/**
	 * 
	 * <p>Title: ���ع��췽��</p> 
	 * <p>Description: ʹ��Ĭ�ϵĴ�����Ϣ</p>
	 */
	public NullParameterException(){
		super();
	}
	
	/**
	 * 
	 * <p>Title: ���췽������</p> 
	 * <p>Description: �����Զ���Ĵ�����Ϣ</p> 
	 * @param msg      ����֪ͨ��Ϣ
	 */
	public NullParameterException(String msg){
		super(msg);
	}
	
	/**
	 * 
	 * <p>Title: ���췽������</p> 
	 * <p>Description: �����Զ���Ĵ�����Ϣ�ʹ���ԭ��</p> 
	 * @param msg      �Զ������֪ͨ��Ϣ
	 * @param reason   �Զ������ԭ��
	 */
	public NullParameterException(String msg,Throwable reason){
		super(msg,reason);
	}
	
	/**
	 * 
	 * <p>Title: ���췽������</p> 
	 * <p>Description: �����Զ������ԭ��</p> 
	 * @param reason   ����ԭ��
	 */
	public NullParameterException(Throwable reason){
		super(reason);
	}


}
