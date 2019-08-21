package com.paper.dao.community;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.paper.sql.CommunitySql;

import model.Community;

public class CommunityDaoImpl extends com.paper.dao.BaseDao implements CommunityDao {
	

	@Override
	public List<Community> select(int requestPage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Community> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Community selectByCoummuId(int commu_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Community> selectByUserId(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Community> selectBySearch(String searchText) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Community community) {
		
		Connection	con = null; 
		PreparedStatement pst = null;
		
		try {
			con = getConnection();
			pst = con.prepareStatement(CommunitySql.COMMUNITY_INSERT_SQL);
			
			pst.setString(1, community.getEmail());
			pst.setString(2, community.getCommu_title());
			pst.setString(3, community.getCommu_content());
			pst.setInt(4, community.getCommu_hit());
			pst.setInt(5, community.getCommu_open());
			
			int result = pst.executeUpdate();
			
			if(result>0) return true;
			else return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			closeDBObjects(null, pst, con);
		}
	}

	@Override
	public boolean update(Community community) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int commu_id) {
		// TODO Auto-generated method stub
		return false;
	}





}
