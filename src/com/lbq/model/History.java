package com.lbq.model;

import java.util.Date;

public class History {
	private int id;
	private int userId;
	private String searchKey;
	private Date date;
	public History() {
		
	}
	public History(int id, int userId, String searchKey, Date date) {
		super();
		this.id = id;
		this.userId = userId;
		this.searchKey = searchKey;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "History [id=" + id + ", userId=" + userId + ", searchKey=" + searchKey + ", date=" + date + "]";
	}
	
}
