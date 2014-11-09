/**  
* @Project: orderserver
* @Title: Job.java
* @Package com.zhang.beans.users
* @Description: 管理员职位持久化对象
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-9 上午8:56:06
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.beans.users;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @ClassName Job
 * @Description TODO
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */
@Entity
@Table(name="T_JOB")
public class Job implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 5191942744640740531L;
	/**主键**/
	private int id;
	/**职位名字**/
	private String name;
	/**职位描述**/
	private String desc;
	/**具有的权限**/
	private Set<Authority> authoritys = new HashSet<Authority>();
	
	
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: 构造方法</p>  
	*/
	public Job() {
		super();
		
	}
	
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param id
	 * @param name
	 * @param desc
	 * @param authoritys 
	*/
	public Job(int id, String name, String desc, Set<Authority> authoritys) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.authoritys = authoritys;
	}


	@Id
	@GeneratedValue
	@Column(name="JOB_ID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="JOB_NAME",length=10)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="JOB_DESC",length=200)
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@OneToMany(cascade={CascadeType.REFRESH,CascadeType.REMOVE})
	@JoinColumn(name="JOB_AUTHORITY")
	public Set<Authority> getAuthoritys() {
		return authoritys;
	}
	public void setAuthoritys(Set<Authority> authoritys) {
		this.authoritys = authoritys;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((authoritys == null) ? 0 : authoritys.hashCode());
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
		Job other = (Job) obj;
		if (authoritys == null) {
			if (other.authoritys != null)
				return false;
		} else if (!authoritys.equals(other.authoritys))
			return false;
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
		return "Job [id=" + id + ", name=" + name + ", desc=" + desc
				+ ", authoritys=" + authoritys + "]";
	}
	
	
}
