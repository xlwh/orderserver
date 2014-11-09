/**  
* @Project: orderserver
* @Title: NullParameterException.java
* @Package com.zhang.base.exception
* @Description: 参数传入为空异常
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-6 下午9:18:55
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.base.exception;

/**
 * @ClassName NullParameterException
 * @Description 空参数异常
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
	 * <p>Title: 重载构造方法</p> 
	 * <p>Description: 使用默认的错误消息</p>
	 */
	public NullParameterException(){
		super();
	}
	
	/**
	 * 
	 * <p>Title: 构造方法重载</p> 
	 * <p>Description: 传入自定义的错误消息</p> 
	 * @param msg      错误通知消息
	 */
	public NullParameterException(String msg){
		super(msg);
	}
	
	/**
	 * 
	 * <p>Title: 构造方法重载</p> 
	 * <p>Description: 传入自定义的错误消息和错误原因</p> 
	 * @param msg      自定义错误通知消息
	 * @param reason   自定义错误原因
	 */
	public NullParameterException(String msg,Throwable reason){
		super(msg,reason);
	}
	
	/**
	 * 
	 * <p>Title: 构造方法重载</p> 
	 * <p>Description: 传入自定义错误原因</p> 
	 * @param reason   错误原因
	 */
	public NullParameterException(Throwable reason){
		super(reason);
	}


}
