package com.lbq.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lbq.model.History;

public class HistoryUtil {
	public static List<History> parseResultSetToHistoryList(ResultSet rs){
		List<History> historyList = new ArrayList<History>();
			if(null == rs) {
				return historyList;
			}
			
			try {
				while(rs.next()) {
					History history = new History();
					history.setId(rs.getInt(1));
					history.setUserId(rs.getString(2));
					history.setSearchKey(rs.getString(3));
					history.setDate(rs.getDate(4));
					historyList.add(history);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return historyList;
	}
}
