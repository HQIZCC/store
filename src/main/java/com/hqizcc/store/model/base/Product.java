package com.hqizcc.store.model.base;

import java.io.Serializable;

/**
 * 商品的父类
 * 具有共同的属性
 * 实现了序列化
 * @author hq
 */
public abstract class Product extends BaseModel implements Serializable {

	/**
	 * 序列化id
	 */
	private static final long serialVersionUID = -1889753133754736045L;
	
	private String name;	// 商品的名字
	private String qrCode;	// 二维码
	private String size;	// 尺寸/大小/规格
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

}
