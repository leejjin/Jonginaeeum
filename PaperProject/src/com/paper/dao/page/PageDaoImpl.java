package com.paper.dao.page;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PageDaoImpl extends com.paper.dao.BaseDao implements PageDao {

	
	@Override
	public int getCount(String sql) {

		int result = 0;
		Connection con = null; 
		Statement st = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				result = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDBObjects(rs, st, con);
		}
		
		return result;
	}

}
