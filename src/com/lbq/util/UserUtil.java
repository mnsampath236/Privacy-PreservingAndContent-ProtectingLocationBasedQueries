package com.lbq.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lbq.model.User;

public abstract class UserUtil {
	public static List<User> parseResultSet(ResultSet rs) {
		List<User> users = new ArrayList<User>();
			if(null!= rs) {
				try {
					while(rs.next()) {
						User user = new User();
						user.setUserId(rs.getString(1));
						user.setFirstName(rs.getString(2));
						user.setLastName(rs.getString(3));
						user.setMobile(rs.getString(4));
						user.setEmilId(rs.getString(5));
						user.setActive(rs.getInt(7));
						users.add(user);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		return users;
	}
}
