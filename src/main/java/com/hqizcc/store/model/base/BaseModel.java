package com.hqizcc.store.model.base;

import java.util.Date;

/**
 * model的公有属性类
 * @author hq
 */
public class BaseModel {

	private Long id;
	private Date create_date;
	private Date update_date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	
}
