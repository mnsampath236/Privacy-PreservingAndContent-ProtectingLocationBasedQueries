package com.lbq.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.lbq.db.DBUtil;
import com.lbq.model.History;
import com.lbq.util.Constants;
import com.lbq.util.EncryptDecryptString;
import com.lbq.util.HistoryUtil;

public class HistoryDaoImpl implements HistoryDao {

	public String recordSearchHistory(History history) {
		String result = Constants.FAIL;
		java.util.Date dt = new java.util.Date();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sdf.format(dt);
		String searchKey = EncryptDecryptString.encrypt(history.getSearchKey());
		String query = "insert into history (user_id,search_key,date) values('" + history.getUserId() + "','"
				+ searchKey + "','" + currentTime + "')";
		int response = DBUtil.insert(query);
		if (response > 0) {
			result = Constants.SUCCESS;
		} else if (response == -1) {
			result = Constants.DUPLICATE_ID;
		}
		Logger.getLogger(HistoryDaoImpl.class.getName()).log(Level.INFO, "recordSearchHistory result : " + result);
		return result;
	}

	public List<History> getSearchHistoryByDate(History history) {
		List<History> historyResp = null;
		Logger.getLogger(HistoryDaoImpl.class.getName()).log(Level.INFO, "getSearchHistoryByDate request  : " + history);
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sdf.format(history.getDate());
		String query = "SELECT * FROM history where user_id='"+history.getUserId()+"' and date <= '"+currentTime+"' order by date desc";
		historyResp = HistoryUtil.parseResultSetToHistoryList(DBUtil.getData(query));
		Logger.getLogger(HistoryDaoImpl.class.getName()).log(Level.INFO, "getSearchHistoryByDate result : " + historyResp);
		return historyResp;
	}

	public List<History> getSearchHistoryByUserId(History history) {
		String result = Constants.EMPTY;

		Logger.getLogger(HistoryDaoImpl.class.getName()).log(Level.INFO, "getSearchHistoryByDate result : " + result);
		return null;
	}

	public List<History> getSearchHistoryByUserIdAndSearchKey(History history) {
		String result = Constants.EMPTY;

		Logger.getLogger(HistoryDaoImpl.class.getName()).log(Level.INFO, "getSearchHistoryByDate result : " + result);
		return null;
	}

}
