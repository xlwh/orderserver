
package com.zhang.beans.book;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @ClassName OrderDeliverInfo
 * @Description 配送信息持久化对象
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */
@Entity
@Table(name="T_ORDERDELIVERINFO")
public class OrderDeliverInfo {
	/**主键**/
	private Integer deliverid;
	/** 收货人姓名 **/
	private String recipients;
	/** 配送地址 **/
	private String address;
	/** 电子邮箱 **/
	private String email;
	/** 邮编 **/
	private String postalcode;
	/** 座机 **/
	private String tel;
	/** 手机 **/
	private String mobile;
	/** 送货方式 **/
	private DeliverWay deliverWay;
	/** 时间要求 **/
	private String requirement;
	/** 所属的订单 **/
	private Order order;
	/**送餐者信息**/
	private Sender sender;
	
	@OneToOne(mappedBy="orderDeliverInfo", cascade=CascadeType.REFRESH)
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Id 
	@GeneratedValue
	@Column(name="ORDERDELIVERINFO_ID")
	public Integer getDeliverid() {
		return deliverid;
	}
	public void setDeliverid(Integer deliverid) {
		this.deliverid = deliverid;
	}
	@Enumerated(EnumType.STRING)
	@Column(length=23,nullable=false,name="ORDERDELIVERINFO_DELIVERWAY")
	public DeliverWay getDeliverWay() {
		return deliverWay;
	}
	public void setDeliverWay(DeliverWay deliverWay) {
		this.deliverWay = deliverWay;
	}
	@Column(length=30,name="ORDERDELIVERINFO_REQUIREMENT")
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	
	@Column(length=8,nullable=false,name="ORDERDELIVERINFO_RECIPIENTS")
	public String getRecipients() {
		return recipients;
	}
	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}
	
	@Column(length=40,nullable=false,name="ORDERDELIVERINFO_ADDRESS")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(length=40,name="ORDERDELIVERINFO_EMAIL")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(length=6,name="ORDERDELIVERINFO_POSTCODE")
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	@Column(length=18,name="ORDERDELIVERINFO_TEL")
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Column(length=11,name="ORDERDELIVERINFO_MOBILE")
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((deliverid == null) ? 0 : deliverid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final OrderDeliverInfo other = (OrderDeliverInfo) obj;
		if (deliverid == null) {
			if (other.deliverid != null)
				return false;
		} else if (!deliverid.equals(other.deliverid))
			return false;
		return true;
	}
	
	@ManyToOne
	@JoinColumn(name="ORDERDELIVERINFO_SENDER")
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	
	
	
}
