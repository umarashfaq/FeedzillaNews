package com.umarashfaq.sample;

import java.io.Serializable;

/**
 * Item is a simple Java bean (stateful object with getters and setters)
 * to store and share information related to a news item
 * @author Umar
 *
 */
public class Item implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String headline;
	private String detail;
	
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Item(String headline, String detail) {
		super();
		this.headline = headline;
		this.detail = detail;
	}

	
}
