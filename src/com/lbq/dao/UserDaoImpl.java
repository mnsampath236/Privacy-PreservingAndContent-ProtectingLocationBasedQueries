package com.lbq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.lbq.db.DBUtil;
import com.lbq.model.User;
import com.lbq.util.Constants;
import com.lbq.util.UserUtil;

public class UserDaoImpl implements UserDao {

	public String login(User user) {
		if ("admin".equalsIgnoreCase(user.getUserId()) && "admin".equalsIgnoreCase(user.getPassword())) {
			return Constants.SUCCESS;
		} else {
			String query = "select * from user where userid = '" + user.getUserId() + "' and password = '"
					+ user.getPassword() + "'";
			String result = Constants.FAIL;
			ResultSet rs = DBUtil.getData(query);
			try {
				if (rs != null && rs.next()) {
					result = Constants.SUCCESS;
				}
			} catch (SQLException ex) {
				Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
			} finally {
				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException ex) {
						Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
				if (DBUtil.statement != null) {
					try {
						DBUtil.statement.close();
					} catch (SQLException ex) {
						Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}

			Logger.getLogger(UserDaoImpl.class.getName()).log(Level.INFO, "Login result : " + result);
			return result;
		}
	}

	public String register(User user) {
		String result = Constants.FAIL;
		String query = "insert into user values ('" + user.getUserId() + "','" + user.getFirstName() + "','"
				+ user.getLastName() + "','" + user.getMobile() + "','" + user.getEmilId() + "','" + user.getPassword()
				+ "')";
		int response = DBUtil.insert(query);
		if (response > 0) {
			result = Constants.SUCCESS;
		} else if (response == -1) {
			result = Constants.DUPLICATE_ID;
		}
		Logger.getLogger(UserDaoImpl.class.getName()).log(Level.INFO, "Register result : " + result);
		return result;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = null;
		String query = "select * from user order by active";
		users = UserUtil.parseResultSet(DBUtil.getData(query));
		Logger.getLogger(UserDaoImpl.class.getName()).log(Level.INFO, "Users List result : " + users);
		return users;
	}

	@Override
	public String acivateUser(User user) {
		
		String result = Constants.FAIL;
		String query = "update user set active = 1 where userid = '"+user.getUserId()+"'";
		int response = DBUtil.insert(query);
		if (response > 0) {
			result = Constants.SUCCESS;
		} else if (response == -1) {
			result = Constants.DUPLICATE_ID;
		}
		Logger.getLogger(UserDaoImpl.class.getName()).log(Level.INFO, "acivateUser result : " + result);
		return result;
	}

	@Override
	public String deactivateUser(User user) {
		String result = Constants.FAIL;
		String query = "update user set active = 0 where userid = '"+user.getUserId()+"'";
		int response = DBUtil.insert(query);
		if (response > 0) {
			result = Constants.SUCCESS;
		} else if (response == -1) {
			result = Constants.DUPLICATE_ID;
		}
		Logger.getLogger(UserDaoImpl.class.getName()).log(Level.INFO, "deactivateUser result : " + result);
		return result;
	}

	@Override
	public String deleteUSe(User user) {
		String result = Constants.FAIL;
		String query = "delete from user where userid = '"+user.getUserId()+"'";
		int response = DBUtil.insert(query);
		if (response > 0) {
			result = Constants.SUCCESS;
		} else if (response == -1) {
			result = Constants.DUPLICATE_ID;
		}
		Logger.getLogger(UserDaoImpl.class.getName()).log(Level.INFO, "deactivateUser result : " + result);
		return result;
	}

}