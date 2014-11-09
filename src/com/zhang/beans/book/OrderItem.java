package com.zhang.beans.book;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 
 * @ClassName OrderItem
 * @Description ������Ŀ
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-9
 */
@Entity
@Table(name="T_ORDERITEM")
public class OrderItem implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 1L;
	/**����**/
	private Integer itemid;
	/** ��Ʒ����* */
	private String productName;
	/** ��ƷƷid **/
	private Integer productid;
	/** ��Ʒ���ۼ� **/
	private Float productPrice = 0f;
	/** ��Ʒ���� **/
	private Integer amount = 1;
	/** ��ƷƷ��ʽ**/
	private String styleName;	
	/** ��Ʒ��ʽID **/
	private Integer styleid;
	/** �������� **/
	private Order order;
	
	public OrderItem(){}
	
	public OrderItem(String productName, Integer productid, Float productPrice,
			Integer amount, String styleName, Integer styleid) {
		this.productName = productName;
		this.productid = productid;
		this.productPrice = productPrice;
		this.amount = amount;
		this.styleName = styleName;
		this.styleid = styleid;
	}
	@Id 
	@GeneratedValue
	@Column(name="ORDERITEM_ID")
	public Integer getItemid() {
		return itemid;
	}
	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}
	@Column(length=50,nullable=false,name="ORDERITEM_PRODUCTNAME")
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Column(nullable=false,name="ORDERITEM_PRODUCTID")
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	@Column(nullable=false,name="ORDERITEM_PRODUCTPRICE")
	public Float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}
	@Column(nullable=false,name="ORDERITEM_AMOUNT")
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Column(length=30,nullable=false,name="ORDERITEM_STYLENAME")
	public String getStyleName() {
		return styleName;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	@Column(nullable=false,name="ORDERITEM_STYLEID")
	public Integer getStyleid() {
		return styleid;
	}
	public void setStyleid(Integer styleid) {
		this.styleid = styleid;
	}
	@ManyToOne(cascade={CascadeType.MERGE, CascadeType.REFRESH}, optional=false)
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
		result = prime * result + ((itemid == null) ? super.hashCode() : itemid.hashCode());
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
		final OrderItem other = (OrderItem) obj;
		if (itemid == null) {
			if (other.itemid != null)
				return false;
		} else if (!itemid.equals(other.itemid))
			return false;
		return true;
	}
	
}
