package com.zhang.beans.product;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity 
@Table(name="T_VEGETYPE")
public class VegeType implements Serializable{
	private static final long serialVersionUID = 8106351120886053881L;
	/** 类别id **/
	private Integer typeid;
	/** 类别名称 **/
	private String name;
	/** 备注,用于google搜索页面描述 **/
	private String note;
	/** 是否可见 **/
	private Boolean visible = true;
	/** 子类别 **/
	private Set<VegeType> childtypes = new HashSet<VegeType>();
	/** 所属父类 **/
	private VegeType parent;
	
	private Set<VegeInfo> products = new HashSet<VegeInfo>();
	
	@OneToMany( cascade=CascadeType.REMOVE)
	@JoinColumn(name="VEGES_ID")
	public Set<VegeInfo> getProducts() {
		return products;
	}

	public void setProducts(Set<VegeInfo> products) {
		this.products = products;
	}

	public VegeType() {}
	
	public VegeType(Integer typeid) {
		this.typeid = typeid;
	}

	public VegeType(String name, String note) {
		this.name = name;
		this.note = note;
	}
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="VEGETYPEPARENT_ID")
	public VegeType getParent() {
		return parent;
	}

	public void setParent(VegeType parent) {
		this.parent = parent;
	}
	@OneToMany(cascade={CascadeType.REFRESH,CascadeType.REMOVE},mappedBy="parent")
	public Set<VegeType> getChildtypes() {
		return childtypes;
	}

	public void setChildtypes(Set<VegeType> childtypes) {
		this.childtypes = childtypes;
	}

	@Column(name="VEGETYPE_NAME",length=36,nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="VEGETYPE_NOTE",length=200)
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name="VEGETYPE_VISIBLE",nullable=false)
	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="VEGETYPE_ID")
	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((typeid == null) ? 0 : typeid.hashCode());
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
		final VegeType other = (VegeType) obj;
		if (typeid == null) {
			if (other.typeid != null)
				return false;
		} else if (!typeid.equals(other.typeid))
			return false;
		return true;
	}
}
