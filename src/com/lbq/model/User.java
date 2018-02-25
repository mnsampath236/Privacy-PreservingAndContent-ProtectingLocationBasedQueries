package com.lbq.model;

public class User {
    private String firstName;
    private String lastName;
    private String emilId;
    private String mobile;
    private String userId;
    private String password;
    private Integer active;
    public User() {
    }

    
    /**
	 * @param firstName
	 * @param lastName
	 * @param emilId
	 * @param mobile
	 * @param userId
	 * @param password
	 * @param active
	 */
	public User(String firstName, String lastName, String emilId, String mobile, String userId, String password,
			Integer active) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emilId = emilId;
		this.mobile = mobile;
		this.userId = userId;
		this.password = password;
		this.active = active;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the emilId
	 */
	public String getEmilId() {
		return emilId;
	}


	/**
	 * @param emilId the emilId to set
	 */
	public void setEmilId(String emilId) {
		this.emilId = emilId;
	}


	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}


	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the active
	 */
	public Integer getActive() {
		return active;
	}


	/**
	 * @param active the active to set
	 */
	public void setActive(Integer active) {
		this.active = active;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", emilId=" + emilId + ", mobile=" + mobile
				+ ", userId=" + userId + ", password=" + password + ", active=" + active + "]";
	}
	

}