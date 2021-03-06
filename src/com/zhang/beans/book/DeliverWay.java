package com.zhang.beans.book;
/**
 * 
 * @ClassName DeliverWay
 * @Description 邮寄方法
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */
public enum DeliverWay {
	/** 平邮 */
	GENERALPOST{
		public String getName(){return "平邮";}
	},
	/** 快递送货上门 */
	EXPRESSDELIVERY{
		public String getName(){return "快递送货上门";}
	},
	/** 加急快递送货上门 */
	EXIGENCEEXPRESSDELIVERY{
		public String getName(){return "加急快递送货上门";}
	},
	/** 国内特快专递EMS */
	EMS{
		public String getName(){return "国内特快专递EMS";}
	};
	public abstract String getName();
}
