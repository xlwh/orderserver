package com.zhang.beans.book;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.zhang.beans.users.ManagerInfo;

/**
 * 
 * @ClassName Message
 * @Description �ͷ����Գ־û�����
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */
@Entity
public class Message implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 1L;
	/**����**/
	private Integer id;
	/** ��������* */
	private String content;
	/** ����ʱ��* */
	private Date createtime = new Date();
	/** ���Ե�Ա��**/
	private ManagerInfo magagerInfo;
	/**���ԵĶ���**/
	private Order order;
	
	@Id 
	@GeneratedValue
	@Column(name="MESSAGE_ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="MESSAGE_CONTENT",length=100,nullable=false)
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Temporal(TemporalType.TIMESTAMP) 
	@Column(name="MESSAGE_CREATETIME",nullable=false)
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="MESSAGE_USER")
	public ManagerInfo getMagagerInfo() {
		return magagerInfo;
	}
	public void setMagagerInfo(ManagerInfo magagerInfo) {
		this.magagerInfo = magagerInfo;
	}
	@ManyToOne(optional=false)
	@JoinColumn(name="ORDER_ID")
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		final Message other = (Message) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content + ", createtime="
				+ createtime + ", magagerInfo=" + magagerInfo + ", order="
				+ order + "]";
	}
	
	
}
