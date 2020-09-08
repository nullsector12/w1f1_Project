package wifi.item.test.model;

import java.util.List;

public class ItemListView {
	
	private int itemTotalCount;
	private int currentPageNumber;
	private List<MyItem> itemList;
	private int pageTotalCount;
	private int itemCountPerPage;
	private int startRow; 
	
	public ItemListView() {
		
	}
	
	public ItemListView(int itemTotalCount, int currentPageNumber, List<MyItem> itemList, int itemCountPerpage,
			int startRow) {
		this.itemTotalCount = itemTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.itemList = itemList;
		this.itemCountPerPage = itemCountPerpage;
		this.startRow = startRow;
		calcPageTotalCount();
	}
	
	public void calcPageTotalCount() {
		
		if(itemTotalCount==0) {
			pageTotalCount = 0;
		} else {
			pageTotalCount = itemTotalCount/itemCountPerPage;
			System.out.println("아이템 토탈 % 아이템퍼페이지의 나머지 : "+itemTotalCount%itemCountPerPage);
			if(itemTotalCount%itemCountPerPage > 0) {
				pageTotalCount ++;
			}
			System.out.println("페이지토탈카운트 : "+pageTotalCount);
		}
		
	}

	public int getItemTotalCount() {
		return itemTotalCount;
	}

	public void setItemTotalCount(int itemTotalCount) {
		this.itemTotalCount = itemTotalCount;
	}

	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	public void setCurrentPageNumber(int currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	public List<MyItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<MyItem> itemList) {
		this.itemList = itemList;
	}

	public int getPageTotalCount() {
		return pageTotalCount;
	}

	public void setPageTotalCount(int pageTotalCount) {
		this.pageTotalCount = pageTotalCount;
	}

	public int getItemCountPerPage() {
		return itemCountPerPage;
	}

	public void setItemCountPerPage(int itemCountPerPage) {
		this.itemCountPerPage = itemCountPerPage;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	@Override
	public String toString() {
		return "ItemListView [itemTotalCount=" + itemTotalCount + ", currentPageNumber=" + currentPageNumber
				+ ", itemList=" + itemList + ", pageTotalCount=" + pageTotalCount + ", itemCountPerPage="
				+ itemCountPerPage + ", startRow=" + startRow + "]";
	}
	
	
	
}
