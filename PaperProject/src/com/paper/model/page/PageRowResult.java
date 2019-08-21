package com.paper.model.page;

public class PageRowResult {

	private int rowStartNumber; //페이지에서 시작하는 넘버
	private int rowEndNumber; //페이지에서 마지막 넘버
	
	public int getRowStartNumber() {
		return rowStartNumber;
	}
	public void setRowStartNumber(int rowStartNumber) {
		this.rowStartNumber = rowStartNumber;
	}
	public int getRowEndNumber() {
		return rowEndNumber;
	}
	public void setRowEndNumber(int rowEndNumber) {
		this.rowEndNumber = rowEndNumber;
	}
	
}
