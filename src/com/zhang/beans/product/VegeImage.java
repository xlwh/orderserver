/**  
* @Project: orderserver
* @Title: VegeImage.java
* @Package com.zhang.domain
* @Description: ²ËÆ·Í¼Æ¬
* @author zhanghongbin mypczhanghongbin@gmail.com
* @date 2014-11-7 ÏÂÎç9:57:01
* @Copyright: 2014 zhanghongbin. All rights reserved.
* @version V1.0  
*/
package com.zhang.beans.product;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @ClassName VegeImage
 * @Description ²ËÆ·Í¼Æ¬
 * @author zhanghongbin mypczhanghongbin@gmail.com
 * @date 2014-11-7
 */
@Entity
@Table(name="T_VEGEIMAGE")
public class VegeImage implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long	serialVersionUID	= 1L;
	/**Í¼Æ¬id**/
	private String id;
	/**Í¼Æ¬Â·¾¶**/
	private String path;
	/**Í¼Æ¬ÉÏ´«Ê±¼ä**/
	private Date saveTime;
	/**Í¼Æ¬ËùÊôµÄ²ËÆ·**/
	private VegeInfo vegeInfo;
	
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name="VEGEIMAGE_ID", unique = true, nullable = false, length = 32)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="VEGEIMAGE_PATH",length=50)
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="VEGEIMAGE_SAVETIME",length = 19)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getSaveTime() {
		return saveTime;
	}
	public void setSaveTime(Date saveTime) {
		this.saveTime = saveTime;
	}
	@ManyToOne(cascade=CascadeType.ALL)
	public VegeInfo getVegeInfo() {
		return vegeInfo;
	}
	public void setVegeInfo(VegeInfo vegeInfo) {
		this.vegeInfo = vegeInfo;
	}
	
}
