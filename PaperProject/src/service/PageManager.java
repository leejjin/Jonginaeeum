package service;

import com.paper.dao.page.PageDao;
import com.paper.dao.page.PageDaoImpl;
import com.paper.model.page.PageGroupResult;
import com.paper.model.page.PageInfo;
import com.paper.model.page.PageRowResult;

public class PageManager {
	
	private int requestPage;
	
	public PageManager(){}
	
	public PageManager(int requestPage){
		this.requestPage = requestPage;
	}
	
	public PageRowResult getPageRowResult() {
		
		PageRowResult pageRowResult = new PageRowResult();
		
		int rowEndNumber  = requestPage * PageInfo.ROW_COUNT_PER_PAGE;
		int rowStartNumber  = rowEndNumber - PageInfo.ROW_COUNT_PER_PAGE + 1;
		
		pageRowResult.setRowStartNumber(rowStartNumber);
		pageRowResult.setRowEndNumber(rowEndNumber);
		
		
		return pageRowResult;
	}
	
	public PageGroupResult getPageGroupResult(String sql) {
		PageGroupResult pageGroupResult = new PageGroupResult();
		
		int requestPageGroupNumber = (int) Math.ceil(requestPage / (double)PageInfo.SHOW_PAGE_COUNT);
		
		pageGroupResult.setGroupStartNumber((requestPageGroupNumber-1)*(PageInfo.SHOW_PAGE_COUNT)+1);
		pageGroupResult.setGroupEndNumber((requestPageGroupNumber)*( PageInfo.SHOW_PAGE_COUNT));

		PageDao pageDao = new PageDaoImpl();
		
		int totalPageNumber = (int) Math.ceil(pageDao.getCount(sql)/(double)PageInfo.ROW_COUNT_PER_PAGE);

		//last 페이지수 확인
		if(pageGroupResult.getGroupEndNumber() > totalPageNumber) {
			pageGroupResult.setGroupEndNumber(totalPageNumber);
		}
		
		//before , after 유무
		if(pageGroupResult.getGroupStartNumber() == 1) {
			pageGroupResult.setBeforePage(false);
		}
		
		if(pageGroupResult.getGroupEndNumber() == totalPageNumber) {
			pageGroupResult.setAfterPage(false);
		}
		
		//선택 페이지 set
		pageGroupResult.setSelectPageNumber(requestPage);

		return pageGroupResult;
	}
	
}
