/**  
* @Project: orderserver
* @Title: Authority.java
* @Package com.zhang.beans.users
* @Description: 管理员权限持久化对象
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-9 上午9:19:30
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.beans.users;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName Authority
 * @Description 管理员权限持久化对象
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */
@Entity
@Table(name="T_AUTHORITY")
public class Authority implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= -4718231644717101459L;
	/***权限主键*/
	private int id;
	/**权限名**/
	private String name;
	/**权限描述**/
	private String desc;
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: 构造方法</p>  
	*/
	public Authority() {
		super();
		
	}

	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param id
	 * @param name
	 * @param desc 
	*/
	public Authority(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	@Id
	@GeneratedValue
	@Column(name="AUTHORITY_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
	@Column(name="AUTHORITY_NAME",length=10)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    @Column(name="AUTHORITY_DESC",length=200)
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Authority other = (Authority) obj;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Authority [id=" + id + ", name=" + name + ", desc=" + desc
				+ "]";
	}
	
}
