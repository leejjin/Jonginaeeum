package com.paper.model.page;

public class PageGroupResult {
	
	private int groupStartNumber;//   1,2,3,4> 에서 groutStartNumber = > 1 
	private int groupEndNumber;//   1,2,3,4> 에서 groupEndNumber = > 4   // 페이지 이동할때 숫자 늘어나고 줄어들고!!
	
	private boolean beforePage = true; //얘 지금 앞에 이전 버튼 이 없는데 만약 groupStartNumber 이 1이면 -> beforePage가 false가 되겠지? ( 앞으로 갈 수 있는 번호가 있는지 확인)
	private boolean afterPage = true; //얘는 마지막 페이지에선 false가 되겠지?
	
	private int selectPageNumber; //현재 선택된 페이지를 좀더 찐하게 한다든지, 줄을 긋는다는지 뭔가 확인 해주는 걸 할수있게, 현재 선택된 페이지를 여기 입력

	public int getGroupStartNumber() {
		return groupStartNumber;
	}

	public void setGroupStartNumber(int groupStartNumber) {
		this.groupStartNumber = groupStartNumber;
	}

	public int getGroupEndNumber() {
		return groupEndNumber;
	}

	public void setGroupEndNumber(int groupEndNumber) {
		this.groupEndNumber = groupEndNumber;
	}

	public boolean isBeforePage() {
		return beforePage;
	}

	public void setBeforePage(boolean beforePage) {
		this.beforePage = beforePage;
	}

	public boolean isAfterPage() {
		return afterPage;
	}

	public void setAfterPage(boolean afterPage) {
		this.afterPage = afterPage;
	}

	public int getSelectPageNumber() {
		return selectPageNumber;
	}

	public void setSelectPageNumber(int selectPageNumber) {
		this.selectPageNumber = selectPageNumber;
	}
	
	
	
	
	
}
