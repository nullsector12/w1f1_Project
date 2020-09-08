package wifi.item.test.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wifi.item.test.dao.ItemDao;
import wifi.item.test.model.ItemListView;
import wifi.item.test.model.MyItem;

@Service
public class ItemListViewService {
	
	private ItemDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public ItemListView getItemList(HttpServletRequest request) {

		dao = template.getMapper(ItemDao.class);

		Map<String, Object> search = new HashMap<String, Object>();

		// 검색 데이터 : searchType, keyword
		String searchType = request.getParameter("searchType");
		String istate = request.getParameter("istate");
		String keyword = request.getParameter("keyword");
		String count = request.getParameter("count");

		System.out.println("searchType : " + searchType);
		System.out.println("keyword : " + keyword);

		// 값이 공백이라면 null로 전달해주기
		if (searchType != null && !searchType.isEmpty()) {
			search.put("searchType", searchType);
		}

		if (keyword != null && !keyword.isEmpty()) {
			if(searchType=="category") {
				int categoryNum =  Integer.parseInt(keyword);
				if(categoryNum==7) {
					categoryNum=0;
					search.put("keyword", categoryNum);
					System.out.println("7일 때 categoryNum : "+categoryNum);
				}else {
					search.put("keyword", categoryNum);
					System.out.println("7이 아닐 때 categoryNum : "+categoryNum);
				}
			}else {
				search.put("keyword", keyword);
			}
		}
		
		if (istate != null && !istate.isEmpty()) {
			search.put("istate", istate);
		}

		// view 로 전달할 결과 데이터
		ItemListView listView = null;

		// 전체 게시물 개수 구하기
		int itemTotalCnt = dao.totalCount(search);
		System.out.println("일반totalCnt ▶" + itemTotalCnt);

		// 한 페이지 당 노출할 게시물의 개수
		int ITEM_CNT_PER_PAGE = 10;
		if (count != null) {
			try {
				ITEM_CNT_PER_PAGE = Integer.parseInt(count);
				System.out.println("ITEM_CNT_PER_PAGE : "+ITEM_CNT_PER_PAGE);
			} catch (NumberFormatException e) {
				System.out.println("숫자 타입의 문자열이 전달되지 않아 예외 발생");
			}
		}

		// 현재 페이지 번호
		int currentPageNumber = 1;
		String page = request.getParameter("page");
		String rpage = request.getParameter("rpage");
		String spage = request.getParameter("spage");
		System.out.println("▶page : " + page);
		System.out.println("▶rpage : " + rpage);
		System.out.println("▶spage : " + spage);
		System.out.println("▶searchType : " + searchType);
		System.out.println("▶istate : " + istate);
		System.out.println("▶keyword : " + keyword);

		if (page != null) {
			try {
				currentPageNumber = Integer.parseInt(page);
			} catch (NumberFormatException e) {
				System.out.println("숫자 타입의 문자열이 전달되지 않아 예외 발생");
			}
		}
		if (rpage != null) {
			try {
				currentPageNumber = Integer.parseInt(rpage);
			} catch (NumberFormatException e) {
				System.out.println("숫자 타입의 문자열이 전달되지 않아 예외 발생");
			}
		}
		if (spage != null) {
			try {
				currentPageNumber = Integer.parseInt(spage);
			} catch (NumberFormatException e) {
				System.out.println("숫자 타입의 문자열이 전달되지 않아 예외 발생");
			}
		}

		// 게시물의 첫번째 행의 index
		int startRow = 0;

		// 한 페이지 당 노출할 리스트
		List<MyItem> itemList = null;

		if (itemTotalCnt > 0) {
			startRow = (currentPageNumber - 1) * ITEM_CNT_PER_PAGE;

			System.out.println("startRow ▶" + startRow);
			
			search.put("startRow", startRow);
			search.put("count", ITEM_CNT_PER_PAGE);
			itemList = dao.selectList(search);
			
			System.out.println("itemList ▶" + itemList);

		} else {
			currentPageNumber = 0;
			itemList = Collections.emptyList();
		}

		listView = new ItemListView(itemTotalCnt, currentPageNumber, itemList, ITEM_CNT_PER_PAGE, startRow);

		System.out.println("▶ listView : " + listView);

		return listView;

	}
	
	

	public ItemListView getItemRList (HttpServletRequest request) {
	
	dao = template.getMapper(ItemDao.class);
	
	// 검색한 결과를 담기위한 Map
	Map<String, Object> search = new HashMap<String, Object>();
	
	String searchType = request.getParameter("searchType");
	int istate = Integer.parseInt(request.getParameter("istate"));
	String keyword = request.getParameter("keyword");
	String count = request.getParameter("count");
	
	if(searchType != null && !searchType.isEmpty()) {
		search.put("searchType", searchType);
	}
	if (keyword != null && !keyword.isEmpty()) {
		search.put("keyword", keyword);
	}
	search.put("istate", istate);
	
	// View로 전달할 결과 데이터
	ItemListView listView = null;
	
	int itemTotalCnt = dao.totalCount(search);
	
	// 한 페이지 당 노출할 게시물 개수
	final int ITEM_CNT_PER_PAGE = 10;
	
	int currentPageNumber = 1;
	String page = request.getParameter("page");
	String rpage = request.getParameter("rpage");
	
	if (page != null) {
		try {
			currentPageNumber = Integer.parseInt(page);
		} catch(NumberFormatException e) {
			System.out.println("숫자 타입의 문자열이 전달되지 않아 예외 발생");
		}
	}
	
	if (rpage != null) {
		try {
			currentPageNumber = Integer.parseInt(rpage);
		} catch(NumberFormatException e) {
			System.out.println("숫자 타입의 문자열이 전달되지 않아 예외 발생");
		}
	}
	
	int startRow = 0;
	
	List<MyItem> itemList = null;
	
	if (itemTotalCnt > 0) {
		startRow = (currentPageNumber - 1) * ITEM_CNT_PER_PAGE;

		System.out.println("startRow ▶" + startRow);
		search.put("startRow", startRow);
		search.put("count", ITEM_CNT_PER_PAGE);

		itemList = dao.selectList(search);
		System.out.println("itemList ▶" + itemList);

	} else {
		currentPageNumber = 0;
		itemList = Collections.emptyList();
	}

	listView = new ItemListView(itemTotalCnt, currentPageNumber, itemList, ITEM_CNT_PER_PAGE, startRow);

	
		return listView;
	}
}
