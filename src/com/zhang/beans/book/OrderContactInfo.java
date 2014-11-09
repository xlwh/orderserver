package com.zhang.beans.book;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * 
 * @ClassName OrderContactInfo
 * @Description 订餐者联系信息
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */
@Entity
@Table(name="T_ORDERCONTACTINFO")
public class OrderContactInfo implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 1L;
	/**主键**/
	private Integer contactid;
	/** 订餐者人姓名 **/
	private String buyerName;
	/** 联系地址* */
	private String address;
	/** 电子邮箱 **/
	private String email;
	/** 邮编* */
	private String postalcode;
	/** 座机**/
	private String tel;
	/** 手机 **/
	private String mobile;
	/** 所属订单 **/
	private Order order;
	
	
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	*/
	public OrderContactInfo() {
		super();
		
	}
	
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param contactid
	 * @param buyerName
	 * @param address
	 * @param email
	 * @param postalcode
	 * @param tel
	 * @param mobile
	 * @param order 
	*/
	public OrderContactInfo(Integer contactid, String buyerName,
			String address, String email, String postalcode, String tel,
			String mobile, Order order) {
		super();
		this.contactid = contactid;
		this.buyerName = buyerName;
		this.address = address;
		this.email = email;
		this.postalcode = postalcode;
		this.tel = tel;
		this.mobile = mobile;
		this.order = order;
	}


	@OneToOne(cascade=CascadeType.REFRESH, mappedBy="orderContactInfo")
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Id 
	@GeneratedValue
	@Column(name="ORDERCONTACTINFO_ID")
	public Integer getContactid() {
		return contactid;
	}
	public void setContactid(Integer contactid) {
		this.contactid = contactid;
	}
	@Column(length=8,nullable=false,name="ORDERCONTACTINFO_NAME")
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	@Column(length=40,nullable=false,name="ORDERCONTACTINFO_ADDRESS")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(length=40,name="ORDERCONTACTINFO_EMAIL")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(length=6,name="ORDERCONTACTINFO_POSTCODE")
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	@Column(length=18,name="ORDERCONTACTINFO_TEL")
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Column(length=11,name="ORDERCONTACTINFO_MOBILE")
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
				+ ((contactid == null) ? 0 : contactid.hashCode());
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
		final OrderContactInfo other = (OrderContactInfo) obj;
		if (contactid == null) {
			if (other.contactid != null)
				return false;
		} else if (!contactid.equals(other.contactid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderContactInfo [contactid=" + contactid + ", buyerName="
				+ buyerName + ", address=" + address + ", email=" + email
				+ ", postalcode=" + postalcode + ", tel=" + tel + ", mobile="
				+ mobile + ", order=" + order + "]";
	}
	
	
	
}
