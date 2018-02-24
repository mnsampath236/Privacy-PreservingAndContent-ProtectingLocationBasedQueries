package com.lbq.dao;

import java.util.List;

import com.lbq.model.History;

public interface HistoryDao {
	public String recordSearchHistory(History history);
	public List<History> getSearchHistoryByDate(History history);
	public List<History> getSearchHistoryByUserId(History history);
	public List<History> getSearchHistoryByUserIdAndSearchKey(History history);
}
