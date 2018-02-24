package com.lbq.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.lbq.db.DBUtil;
import com.lbq.model.History;
import com.lbq.util.Constants;

public class HistoryDaoImpl implements HistoryDao {

	public String recordSearchHistory(History history) {
		String result = Constants.FAIL;
		java.util.Date dt = new java.util.Date();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sdf.format(dt);
		String query = "insert into history (user_id,search_key,date) values(" + history.getUserId() + ",'"
				+ history.getSearchKey() + "','" + currentTime + "')";
		int response = DBUtil.insert(query);
		if (response > 0) {
			result = Constants.SUCCESS;
		} else if (response == -1) {
			result = Constants.DUPLICATE_ID;
		}
		Logger.getLogger(UserDaoImpl.class.getName()).log(Level.INFO, "Register result : " + result);
		return result;
	}

	public List<History> getSearchHistoryByDate(History history) {
		return null;
	}

	public List<History> getSearchHistoryByUserId(History history) {
		return null;
	}

	public List<History> getSearchHistoryByUserIdAndSearchKey(History history) {
		return null;
	}

}
