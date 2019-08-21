package com.paper.sql;

public class CommunitySql {
	
	
	public static final String COMMUNITY_INSERT_SQL = "INSERT INTO community(commu_id, email, commu_title , commu_content, commu_date, commu_hit, commu_open)"
	+ "VALUES (seq_commu.nextval, ? , ?, ?, sysdate, ?, ?);";
	

}
