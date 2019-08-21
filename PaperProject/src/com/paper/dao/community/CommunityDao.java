package com.paper.dao.community;

import java.util.List;

import model.Community;

public interface CommunityDao {

	//게시글보여주기
	List<Community> select(int requestPage);
	//게시글보여주기
	List<Community> selectAll();
	//commu_id로 검색
	Community selectByCoummuId(int commu_id);
	
	List<Community> selectByUserId(String email);
	//검색
	List<Community> selectBySearch(String searchText);
	//게시글 등록
	boolean insert(Community community);
	//게시글 수정
	boolean update(Community community);
	//게시글 삭제
	boolean delete(int commu_id);
	
}
