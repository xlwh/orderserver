/**  
* @Project: orderserver
* @Title: UserImage.java
* @Package com.zhang.beans.users
* @Description: 用户头像
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-9 上午9:00:13
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.beans.users;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @ClassName UserImage
 * @Description 用户头像
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */
@Entity
@Table(name="T_USERIMAGE")
public class UserImage implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= -8764232246295196070L;
	/**主键**/
	private String id;
	/**创建时间**/
	private Date createTime;
	/**头像路径**/
	private String path;
	/** 
	 * <p>Title: </p> 
	 * <p>Description: 构造方法</p>  
	*/
	public UserImage() {
		super();
		
	}
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: 构造方法</p> 
	 * @param id
	 * @param createTime
	 * @param path 
	*/
	public UserImage(String id, Date createTime, String path) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.path = path;
	}

	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name="USERIMAGE_ID",unique = true, nullable = false, length = 32)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
    
	@Column(name="USERIMAGE_CREATETIME")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
	@Column(name="USERIMAGE_PATH")
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
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
		UserImage other = (UserImage) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserImage [id=" + id + ", createTime=" + createTime + ", path="
				+ path + "]";
	}
	
}
