/**  
* @Project: orderserver
* @Title: Place.java
* @Package com.zhang.beans.place
* @Description: 地点信息持久化对象
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-9 上午10:41:55
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.beans.place;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * @ClassName Place
 * @Description 地点信息持久化对象
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */
@Entity
@Table(name="T_PLACE")
public class Place implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 1L;
	/**主键**/
	private String id;
	/**经度**/
    private long longitude;
    /**纬度**/
    private long latitude;
    /**记录时间**/
    private Date saveTime;
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	*/
	public Place() {
		super();
		
	}
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param id
	 * @param longitude
	 * @param latitude
	 * @param saveTime 
	*/
	public Place(String id, long longitude, long latitude, Date saveTime) {
		super();
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
		this.saveTime = saveTime;
	}
	
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name="PLACE_ID",unique = true, nullable = false, length = 32)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="PLACE_LONGITUDE")
	public long getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

    @Column(name="PLACE_LATITUDE")
	public long getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	
	@Temporal(TemporalType.TIMESTAMP) 
	@Column(name="PLACE_SAVETIME",nullable=false)
	public Date getSaveTime() {
		return saveTime;
	}
	public void setSaveTime(Date saveTime) {
		this.saveTime = saveTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (int) (latitude ^ (latitude >>> 32));
		result = prime * result + (int) (longitude ^ (longitude >>> 32));
		result = prime * result
				+ ((saveTime == null) ? 0 : saveTime.hashCode());
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
		Place other = (Place) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (latitude != other.latitude)
			return false;
		if (longitude != other.longitude)
			return false;
		if (saveTime == null) {
			if (other.saveTime != null)
				return false;
		} else if (!saveTime.equals(other.saveTime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Place [id=" + id + ", longitude=" + longitude + ", latitude="
				+ latitude + ", saveTime=" + saveTime + "]";
	}
    
    
}
