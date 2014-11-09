package com.zhang.beans.book;


/**
 * 
 * @ClassName OrderState
 * @Description 订单状态
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */
public enum OrderState {
	
	/** 已取消 */
    CANCEL {public String getName(){return "已取消";}},
    /** 待审核 */
    WAITCONFIRM {public String getName(){return "待审核";}},
    /** 等待付款 */
    WAITPAYMENT {public String getName(){return "等待付款";}},
    /** 正在配货 */
    ADMEASUREPRODUCT {public String getName(){return "正在配货";}},
    /** 等待发货 */
    WAITDELIVER {public String getName(){return "等待发货";}},
    /** 已发货 */
    DELIVERED {public String getName(){return "已发货";}},
    /** 已收货 */
    RECEIVED {public String getName(){return "已收货";}};
    
    public abstract String getName();
}
