/**  
* @Project: orderserver
* @Title: Sender.java
* @Package com.zhang.beans.book
* @Description: TODO
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-9 上午10:29:56
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.beans.book;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.zhang.beans.place.Place;
import com.zhang.beans.users.UserImage;

/**
 * @ClassName Sender
 * @Description 送餐者持久化对象信息
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */
@Entity
@Table(name="T_SENDER")
public class Sender implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 1L;
	/**主键**/
	private String id;
	/**送餐者名字**/
    private String name;
    /**送餐者注册日期**/
    private Date registerTime;
    /**送餐者真实姓名**/
    private String trueName;
    /**送餐者电话**/
    private String phone;
    /**送餐者身份证号**/
    private String idCard;
    /**送餐者注册地址**/
    private String address;
    /**送餐者头像**/
    private UserImage userImage;
    /**送餐者等级**/
    private int level;
    /**送餐者状态**/
    private int state;
    /**送餐者的位置记录**/
    private Set<Place> places = new HashSet<Place>();
    /**送餐者所接的所有订单**/
    private Set<Order> orders = new HashSet<Order>();
	
    /** 
	 * <p>Title: </p> 
	 * <p>Description:构造方法 </p>  
	*/
	public Sender() {
		super();
		
	}

	/** 
	 * <p>Title: Sender</p> 
	 * <p>Description: 构造方法重载</p> 
	 * @param id
	 * @param name
	 * @param registerTime
	 * @param trueName
	 * @param phone
	 * @param idCard
	 * @param address
	 * @param userImage
	 * @param level
	 * @param state
	 * @param places
	 * @param orders 
	*/
	public Sender(String id, String name, Date registerTime, String trueName,
			String phone, String idCard, String address, UserImage userImage,
			int level, int state, Set<Place> places, Set<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.registerTime = registerTime;
		this.trueName = trueName;
		this.phone = phone;
		this.idCard = idCard;
		this.address = address;
		this.userImage = userImage;
		this.level = level;
		this.state = state;
		this.places = places;
		this.orders = orders;
	}

	@Id
	@GeneratedValue
	@Column(name="SENDER_ID")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
    
	@Column(name="SENDER_NAME",length=10)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Temporal(TemporalType.TIMESTAMP) 
	@Column(name="SENDER_REGISTERTIME",nullable=false)
	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	@Column(name="SENDER_TRUENAME",length=10)
	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
    
	@Column(name="SENDER_PHONE",length=11)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    
	@Column(name="SENDER_IDCARD")
	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
    
	@Column(name="SENDER_ADDRESS",length=100)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="SENDER_USERIMAGE")
	public UserImage getUserImage() {
		return userImage;
	}

	public void setUserImage(UserImage userImage) {
		this.userImage = userImage;
	}

	@Column(name="SENDER_LEVEL")
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
    
	@Column(name="SENDER_STATE")
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="SENDER_PLACES")
	public Set<Place> getPlaces() {
		return places;
	}

	public void setPlaces(Set<Place> places) {
		this.places = places;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="SENDER_ORDERS")
	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idCard == null) ? 0 : idCard.hashCode());
		result = prime * result + level;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((orders == null) ? 0 : orders.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((places == null) ? 0 : places.hashCode());
		result = prime * result
				+ ((registerTime == null) ? 0 : registerTime.hashCode());
		result = prime * result + state;
		result = prime * result
				+ ((trueName == null) ? 0 : trueName.hashCode());
		result = prime * result
				+ ((userImage == null) ? 0 : userImage.hashCode());
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
		Sender other = (Sender) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idCard == null) {
			if (other.idCard != null)
				return false;
		} else if (!idCard.equals(other.idCard))
			return false;
		if (level != other.level)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (orders == null) {
			if (other.orders != null)
				return false;
		} else if (!orders.equals(other.orders))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (places == null) {
			if (other.places != null)
				return false;
		} else if (!places.equals(other.places))
			return false;
		if (registerTime == null) {
			if (other.registerTime != null)
				return false;
		} else if (!registerTime.equals(other.registerTime))
			return false;
		if (state != other.state)
			return false;
		if (trueName == null) {
			if (other.trueName != null)
				return false;
		} else if (!trueName.equals(other.trueName))
			return false;
		if (userImage == null) {
			if (other.userImage != null)
				return false;
		} else if (!userImage.equals(other.userImage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sender [id=" + id + ", name=" + name + ", registerTime="
				+ registerTime + ", trueName=" + trueName + ", phone=" + phone
				+ ", idCard=" + idCard + ", address=" + address
				+ ", userImage=" + userImage + ", level=" + level + ", state="
				+ state + ", places=" + places + ", orders=" + orders + "]";
	}
    
	
	
}
