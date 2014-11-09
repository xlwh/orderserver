/**  
* @Project: orderserver
* @Title: ShopInfo.java
* @Package com.zhang.beans.shop
* @Description: 商家信息持久化对象
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-9 下午12:03:27
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.beans.shop;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @ClassName ShopInfo
 * @Description 商家信息持久化对象
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */

@Entity
@Table(name="T_SHOPINFO")
public class ShopInfo implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 8458069051591871766L;
	/**主键**/
	private String id;
	/**商家名字**/
	private String name;
	/**商家地址**/
	private String address;
	/**商家电话**/
	private String tel;
	/**商家手机号**/
	private String phone;
	/**商家简介**/
	private String desc;
	/**商家入驻时间**/
	private Date registerTime;
	/**商家信誉等级**/
	private int level;
	/**商家Logo**/
	private Logo logo;
	/**商家状态**/
	private int state;
	/**商家官方网站地址**/
	private String siteAddress;
	/**商家评论**/
    private Set<Comment> comments = new HashSet<Comment>();
    /**商家证件信息**/
    private Set<PaperInfo> papers = new HashSet<PaperInfo>();
    /**商家包间信息**/
    private Set<RoomInfo> rooms = new HashSet<RoomInfo>();
    /**商家活动信息**/
    private Set<ActivityInfo> activitys = new HashSet<ActivityInfo>();
    /**商家的微博账号**/
    private Set<Webo> webos = new HashSet<Webo>();
	
    /** 
	 * <p>Title: ShopInfo()</p> 
	 * <p>Description: 构造方法</p>  
	*/
	public ShopInfo() {
		super();
		
	}

	
	/** 
	 * <p>Title: ShopInfo()</p> 
	 * <p>Description: 重载构造方法</p> 
	 * @param id
	 * @param name
	 * @param address
	 * @param tel
	 * @param phone
	 * @param desc
	 * @param registerTime
	 * @param level
	 * @param logo
	 * @param state
	 * @param siteAddress
	 * @param comments
	 * @param papers
	 * @param rooms
	 * @param activitys
	 * @param webos 
	*/
	public ShopInfo(String id, String name, String address, String tel,
			String phone, String desc, Date registerTime, int level, Logo logo,
			int state, String siteAddress, Set<Comment> comments,
			Set<PaperInfo> papers, Set<RoomInfo> rooms,
			Set<ActivityInfo> activitys, Set<Webo> webos) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.phone = phone;
		this.desc = desc;
		this.registerTime = registerTime;
		this.level = level;
		this.logo = logo;
		this.state = state;
		this.siteAddress = siteAddress;
		this.comments = comments;
		this.papers = papers;
		this.rooms = rooms;
		this.activitys = activitys;
		this.webos = webos;
	}

	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name="SHOPINFO_ID",unique = true, nullable = false, length = 32)
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

    @Column(name="SHOPINFO_NAME",length=20)
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

    @Column(name="SHOPINFO_ADDRESS",length=100)
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

    @Column(name="SHOPINFO_TEL",length=10)
	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}

    @Column(name="SHOPINFO_PHONE",length=11)
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public Date getRegisterTime() {
		return registerTime;
	}


	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public Logo getLogo() {
		return logo;
	}


	public void setLogo(Logo logo) {
		this.logo = logo;
	}


	public int getState() {
		return state;
	}


	public void setState(int state) {
		this.state = state;
	}


	public String getSiteAddress() {
		return siteAddress;
	}


	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}


	public Set<Comment> getComments() {
		return comments;
	}


	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}


	public Set<PaperInfo> getPapers() {
		return papers;
	}


	public void setPapers(Set<PaperInfo> papers) {
		this.papers = papers;
	}


	public Set<RoomInfo> getRooms() {
		return rooms;
	}


	public void setRooms(Set<RoomInfo> rooms) {
		this.rooms = rooms;
	}


	public Set<ActivityInfo> getActivitys() {
		return activitys;
	}


	public void setActivitys(Set<ActivityInfo> activitys) {
		this.activitys = activitys;
	}


	public Set<Webo> getWebos() {
		return webos;
	}


	public void setWebos(Set<Webo> webos) {
		this.webos = webos;
	}

    /**
     * 
     * <p>Title: hashCode</p> 
     * <p>Description:求解商家信息持久化对象的HashCode </p> 
     * @return        求解出来的商家信息的HashCode
     * @see java.lang.Object#hashCode()
     */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((activitys == null) ? 0 : activitys.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + level;
		result = prime * result + ((logo == null) ? 0 : logo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((papers == null) ? 0 : papers.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result
				+ ((registerTime == null) ? 0 : registerTime.hashCode());
		result = prime * result + ((rooms == null) ? 0 : rooms.hashCode());
		result = prime * result
				+ ((siteAddress == null) ? 0 : siteAddress.hashCode());
		result = prime * result + state;
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		result = prime * result + ((webos == null) ? 0 : webos.hashCode());
		return result;
	}


	/**
	 * 
	 * <p>Title: equals</p> 
	 * <p>Description: 判断两个持久化对象是否为同一个</p> 
	 * @param obj      待判断的对象
	 * @return         判断的结果
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShopInfo other = (ShopInfo) obj;
		if (activitys == null) {
			if (other.activitys != null)
				return false;
		} else if (!activitys.equals(other.activitys))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (level != other.level)
			return false;
		if (logo == null) {
			if (other.logo != null)
				return false;
		} else if (!logo.equals(other.logo))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (papers == null) {
			if (other.papers != null)
				return false;
		} else if (!papers.equals(other.papers))
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
		if (rooms == null) {
			if (other.rooms != null)
				return false;
		} else if (!rooms.equals(other.rooms))
			return false;
		if (siteAddress == null) {
			if (other.siteAddress != null)
				return false;
		} else if (!siteAddress.equals(other.siteAddress))
			return false;
		if (state != other.state)
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		if (webos == null) {
			if (other.webos != null)
				return false;
		} else if (!webos.equals(other.webos))
			return false;
		return true;
	}

     /**
      * 
      * <p>Title: toString</p> 
      * <p>Description:把商家信息持久化对象转为字符串 </p> 
      * @return        商家持久化信息的字符串
      * @see java.lang.Object#toString()
      */
	@Override
	public String toString() {
		return "ShopInfo [id=" + id + ", name=" + name + ", address=" + address
				+ ", tel=" + tel + ", phone=" + phone + ", desc=" + desc
				+ ", registerTime=" + registerTime + ", level=" + level
				+ ", logo=" + logo + ", state=" + state + ", siteAddress="
				+ siteAddress + ", comments=" + comments + ", papers=" + papers
				+ ", rooms=" + rooms + ", activitys=" + activitys + ", webos="
				+ webos + "]";
	}
	
	
    
    
}
