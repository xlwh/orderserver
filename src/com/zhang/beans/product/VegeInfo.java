/**  
* @Project: orderserver
* @Title: Vege.java
* @Package com.zhang.domain
* @Description:��Ʒʵ�����
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-7 ����9:44:40
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.beans.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @ClassName Vege
 * @Description ��Ʒʵ�����
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-7
 */

@Entity
@Table(name="T_VEGEINFO")
public class VegeInfo implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 7495578856708105274L;
	/**��Ʒ�־û���������**/
	private String id;
	/**��Ʒ����**/
	private String name;
	/**��Ʒ�������**/
    private String desc;
    /**���۳���Ŀ**/
    private int saled;
    /**��Ʒ�۸�**/
    private float price;
    /**��Ʒ״̬**/
    private int state;
    /**��Ʒ��������**/
    private VegeType type;
    /**��Ʒ�۸�**/
    private List<VegeImage> images = new ArrayList<VegeImage>();
    /**��Ʒʣ������**/
    private int num;
    
    /** 
	 * <p>Title: </p> 
	 * <p>Description: ���췽��</p>  
	*/
	public VegeInfo() {
		super();
		
	}

   /** 
	 * <p>Title:VegeInfo </p> 
	 * <p>Description:���췽�� </p> 
	 * @param id
	 * @param name
	 * @param desc
	 * @param saled
	 * @param price
	 * @param state
	 * @param type
	 * @param images
	 * @param num 
	*/
	public VegeInfo(String id, String name, String desc, int saled,
			float price, int state, VegeType type, List<VegeImage> images,
			int num) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.saled = saled;
		this.price = price;
		this.state = state;
		this.type = type;
		this.images = images;
		this.num = num;
	}


	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "VEGEINFO_ID", unique = true, nullable = false, length = 32)
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="VEGEINFO_NAME",length=15)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="VEGEINFO_DESC",length=200)
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Column(name="VEGEINFO_SALED")
	public int getSaled() {
		return saled;
	}
	public void setSaled(int saled) {
		this.saled = saled;
	}
	@Column(name="VEGEINFO_PRICE")
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Column(name="VEGEINFO_STATE")
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}

	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="TYPE_ID")
	public VegeType getType() {
		return type;
	}


	public void setType(VegeType type) {
		this.type = type;
	}

    @OneToMany(cascade={CascadeType.REFRESH,CascadeType.REMOVE})
    @JoinColumn(name="VEGEINFO_IMAGES")
	public List<VegeImage> getImages() {
		return images;
	}


	public void setImages(List<VegeImage> images) {
		this.images = images;
	}

    @Column(name="VEGEINFO_NUM")
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
	
	
	/**
	 * 
	 * <p>Title: hashCode</p> 
	 * <p>Description: ����Hash��</p> 
	 * @return         �����Hash��
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((images == null) ? 0 : images.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + saled;
		result = prime * result + state;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/**
	 * 
	 * <p>Title: equals</p> 
	 * <p>Description: �ж������־û������ǲ���ͬһ��</p> 
	 * @param obj      Ҫ�жϵĶ���
	 * @return         �ж����
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
		VegeInfo other = (VegeInfo) obj;
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
		if (images == null) {
			if (other.images != null)
				return false;
		} else if (!images.equals(other.images))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (saled != other.saled)
			return false;
		if (state != other.state)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	/**
	 * 
	 * <p>Title: toString</p> 
	 * <p>Description:�Ѳ�Ʒ����ת��Ϊ�ַ��� </p> 
	 * @return        �����ַ����Ĳ�Ʒ�־û�����
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VegeInfo [id=" + id + ", name=" + name + ", desc=" + desc
				+ ", saled=" + saled + ", price=" + price + ", state=" + state
				+ ", type=" + type + ", images=" + images + ", num=" + num
				+ "]";
	}
	
	
}
