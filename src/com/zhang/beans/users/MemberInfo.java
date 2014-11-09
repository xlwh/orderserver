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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="T_MEMBERINFO")
public class MemberInfo implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 1030410970610758556L;
	/**会员信息主键**/
	private String	userId;
	/**会员账号**/
	private String number;
	/**会员昵称**/
	private String	userName;
	/**会员电话**/
	private String phone;
    /**会员地址**/
	private String address;
	/**会员QQ号*/
	private String qq;
	/**会员邮箱号**/
	private String email;
	/** 会员真实姓名**/
    private String trueName;
	/**会员所在地邮政编码**/
    private String mailCode;
	/**会员注册日期**/
    private Date  registerTime;
	/**会员在线状态**/
    private int state;
	/**会员等级**/
    private int level;
    /**会员登录密码**/
    private String password;
    private UserImage userImage;
    
    
   
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	*/
	public MemberInfo() {
		super();
		
	}
	
	

	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param userId
	 * @param number
	 * @param userName
	 * @param phone
	 * @param address
	 * @param qq
	 * @param email
	 * @param trueName
	 * @param mailCode
	 * @param registerTime
	 * @param state
	 * @param level
	 * @param password
	 * @param userImage 
	*/
	public MemberInfo(String userId, String number, String userName,
			String phone, String address, String qq, String email,
			String trueName, String mailCode, Date registerTime, int state,
			int level, String password, UserImage userImage) {
		super();
		this.userId = userId;
		this.number = number;
		this.userName = userName;
		this.phone = phone;
		this.address = address;
		this.qq = qq;
		this.email = email;
		this.trueName = trueName;
		this.mailCode = mailCode;
		this.registerTime = registerTime;
		this.state = state;
		this.level = level;
		this.password = password;
		this.userImage = userImage;
	}



	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name="MEMBERINFO_ID",unique = true, nullable = false, length = 32)
    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
    
	@Column(name="MEMBERINFO_USERNAME",length=15)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
     
	@Column(name="MEMBERINFO_PHONE",length=11)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name="MEMBERINFO",length=100)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
	@Column(name="MEMBERINFO_QQ",length=15)
	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name="MEMBERINFO_EMAIL",length=25)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
	@Column(name="MEMBERINFO_TRUENAME")
	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	@Column(name="MEMBERINFO_NAME",length=10)
	public String getMailCode() {
		return mailCode;
	}

	public void setMailCode(String mailCode) {
		this.mailCode = mailCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MEMBERINFO_REGISTERTIME", length = 19)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	@Column(name="MEMBERINFO_STATE")
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
    
	@Column(name="MEMBERINFO_LEVEL")
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
    
	@Column(name="MEMBERINFO_PASSWORD",length=16)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="MEMBERINFO_NUMBER",length=20)
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
    
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="MEMBERINFO_IMAGE")
	public UserImage getUserImage() {
		return userImage;
	}

	public void setUserImage(UserImage userImage) {
		this.userImage = userImage;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberInfo other = (MemberInfo) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (level != other.level)
			return false;
		if (mailCode == null) {
			if (other.mailCode != null)
				return false;
		} else if (!mailCode.equals(other.mailCode))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
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
		if (qq == null) {
			if (other.qq != null)
				return false;
		} else if (!qq.equals(other.qq))
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
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userImage == null) {
			if (other.userImage != null)
				return false;
		} else if (!userImage.equals(other.userImage))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + level;
		result = prime * result
				+ ((mailCode == null) ? 0 : mailCode.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((qq == null) ? 0 : qq.hashCode());
		result = prime * result
				+ ((registerTime == null) ? 0 : registerTime.hashCode());
		result = prime * result + state;
		result = prime * result
				+ ((trueName == null) ? 0 : trueName.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result
				+ ((userImage == null) ? 0 : userImage.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
