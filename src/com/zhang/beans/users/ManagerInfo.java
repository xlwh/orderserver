/**  
* @Project: orderserver
* @Title: Manager.java
* @Package com.zhang.beans.users
* @Description: 系统管理员持久化对象
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-9 上午8:53:52
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.beans.users;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @ClassName Manager
 * @Description 系统管理员持久化对象
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */

@Entity
@Table(name="T_MANAGERINFO")
public class ManagerInfo implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 2822676816493099952L;
	/**主键**/
	public int id;
	/**账号**/
	public String name;
	/**职位**/
	public Job job;
	/**真实姓名**/
	public String trueName;
	/**登录密码**/
	public String password;
	/**邮箱**/
	public String email;
	/**电话号码**/
	public String phone;
	/**管理员头像**/
	public UserImage userImage;
	/**管理员身份证号码**/
	public String idCard;
	/**注册时间**/
	public Date registerTime;
	
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	*/
	public ManagerInfo() {
		super();
		
	}
    
	

	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param id
	 * @param name
	 * @param job
	 * @param trueName
	 * @param password
	 * @param email
	 * @param phone
	 * @param userImage
	 * @param idCard
	 * @param registerTime 
	*/
	public ManagerInfo(int id, String name, Job job, String trueName,
			String password, String email, String phone, UserImage userImage,
			String idCard, Date registerTime) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.trueName = trueName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.userImage = userImage;
		this.idCard = idCard;
		this.registerTime = registerTime;
	}



	@Id
	@GeneratedValue
	@Column(name="MANAGERINFO_ID")
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="MANAGERINFO_NAME",length=15)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="MANAGERINFOIOB_ID")
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
	@Column(name="MANAGERINFO_TRUENAME",length=10)
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	
	@Column(name="MANAGERINFO_PASSWORD",length=16)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="MANAGERINFO_EMAIL",length=20)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="MANAGERINFO_PHONE",length=11)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="MAMAGERINFO_IMAGE")
	public UserImage getUserImage() {
		return userImage;
	}
	public void setUserImage(UserImage userImage) {
		this.userImage = userImage;
	}
	
	@Column(name="MANAGERINFO_CARDNUMBER")
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

    @Column(name="MANAGERINFO_REGISTERTIME")
	public Date getRegisterTime() {
		return registerTime;
	}


	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((idCard == null) ? 0 : idCard.hashCode());
		result = prime * result + ((job == null) ? 0 : job.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result
				+ ((registerTime == null) ? 0 : registerTime.hashCode());
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
		ManagerInfo other = (ManagerInfo) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (idCard == null) {
			if (other.idCard != null)
				return false;
		} else if (!idCard.equals(other.idCard))
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (registerTime == null) {
			if (other.registerTime != null)
				return false;
		} else if (!registerTime.equals(other.registerTime))
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
		return "ManagerInfo [id=" + id + ", name=" + name + ", job=" + job
				+ ", trueName=" + trueName + ", password=" + password
				+ ", email=" + email + ", phone=" + phone + ", userImage="
				+ userImage + ", idCard=" + idCard + ", registerTime="
				+ registerTime + "]";
	}
	
	
	
}
