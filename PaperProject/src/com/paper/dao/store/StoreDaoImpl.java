package com.paper.dao.store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.paper.model.page.PageRowResult;
import com.paper.sql.StoreSql;

import model.Store;
import service.PageManager;

public class StoreDaoImpl extends com.paper.dao.BaseDao implements StoreDao {

	@Override
	public List<Store> selectSeoul() {

		List<Store> stores = new ArrayList<Store>();
		Connection	con = null; 
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {

			con = getConnection();
			pst = con.prepareStatement(StoreSql.STORE_SELECT_SEOUL_SQL);
			pst.setString(1, "서울");

			//페이징 처리
			/*PageManager pageManager = new PageManager(requestPage);
			PageRowResult pageRowResult = pageManager.getPageRowResult();
*/
		/*	pst.setInt(1, pageRowResult.getRowStartNumber());
			pst.setInt(2, pageRowResult.getRowEndNumber());
*/
			rs= pst.executeQuery();

			while(rs.next()) {
				Store store = new Store();
				store.setBook_name(rs.getString("book_name"));
				store.setBook_profile(rs.getString("book_profile"));
				stores.add(store);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDBObjects(rs, pst, con);
		}
		return stores;
	}

	@Override
	public List<Store> select() {
		// TODO Auto-generated method stub
		return null;
	}



}
