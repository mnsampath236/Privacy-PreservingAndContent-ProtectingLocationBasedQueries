package com.lbq.model;

import java.util.Date;

public class History {
	private int id;
	private String userId;
	private String searchKey;
	private Date date;
	public History() {
		
	}
	/**
	 * @param id
	 * @param userId
	 * @param searchKey
	 * @param date
	 */
	public History(int id, String userId, String searchKey, Date date) {
		this.id = id;
		this.userId = userId;
		this.searchKey = searchKey;
		this.date = date;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the searchKey
	 */
	public String getSearchKey() {
		return searchKey;
	}
	/**
	 * @param searchKey the searchKey to set
	 */
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "History [id=" + id + ", userId=" + userId + ", searchKey=" + searchKey + ", date=" + date + "]";
	}
	
}
