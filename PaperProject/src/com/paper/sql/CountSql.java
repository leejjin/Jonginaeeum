package com.paper.sql;

public class CountSql {
	
	public static final String STORE_SELECT_ALL_COUNT_SQL = "SELECT count(*) cnt FROM store";

	public static final String MEMO_SELECT_ALL_COUNT_SQL = "SELECT count(memoid) cnt FROM memo";
	public static final String REVIEW_SELECT_ALL_COUNT_SQL = "SELECT count(review_id) cnt FROM review";
	public static final String LETTER_SELECT_ALL_COUNT_SQL = "SELECT count(letter_id) cnt FROM letter WHERE user_id = ";
	public static final String LETTER_SELECT_BY_MAIL_ALL_COUNT_SQL = "SELECT  count(*) cnt  FROM letter l LEFT OUTER JOIN member u  ON l.user_id = u.user_id WHERE (l.letter_email != u.email)  AND (l.are_u_send = 9) AND l.user_id != ";
	public static final String QA_SELECT_ALL_COUNT_SQL = "select count(qa_id) cnt from qa";
	
	
}
