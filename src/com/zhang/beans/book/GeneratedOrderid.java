package com.zhang.beans.book;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_GENERATEDORDERID")
public class GeneratedOrderid implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 1L;
	/**持久化记录主键**/
	private String id;
	/**订单id**/
	private Integer orderid = 0;
	
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	*/
	public GeneratedOrderid() {
		super();
		
	}
	
	
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param id
	 * @param orderid 
	*/
	public GeneratedOrderid(String id, Integer orderid) {
		super();
		this.id = id;
		this.orderid = orderid;
	}


	@Id 
	@Column(length=5,name="GENERATEDORDERID_ID")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Column(nullable=false,name="GENERATEDORDERID_ORDERID")
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orderid == null) ? 0 : orderid.hashCode());
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
		GeneratedOrderid other = (GeneratedOrderid) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (orderid == null) {
			if (other.orderid != null)
				return false;
		} else if (!orderid.equals(other.orderid))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "GeneratedOrderid [id=" + id + ", orderid=" + orderid + "]";
	}
	
	
}
