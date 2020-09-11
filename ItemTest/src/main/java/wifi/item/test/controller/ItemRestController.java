package wifi.item.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wifi.item.test.model.ItemListView;
import wifi.item.test.model.ItemRegRequest;
import wifi.item.test.service.ItemListViewService;
import wifi.item.test.service.ItemRegService;


@RestController
@RequestMapping("/items")
public class ItemRestController {

	@Autowired
	private ItemRegService regService;
	
	@Autowired
	private ItemListViewService listService;
	
	@PostMapping
	public int regItem (ItemRegRequest regRequest, HttpServletRequest request ) {
		
		System.out.println("아이템 리퀘스트 확인 : " + regRequest);
		System.out.println("리퀘스트 확인 : " + request);
		
		return regService.regItem(regRequest, request);
	}
	
	
	@GetMapping
	public ItemListView getItemList (HttpServletRequest request) {
		
//		String searchType = request.getParameter("searchType");
		String istate = request.getParameter("istate");
//		String keyword = request.getParameter("keyword");
		
//		if(keyword.isEmpty()) {
//			keyword = "keyword : NULL";
//		}
		
		if(istate==null) {
			istate = "널";
		}
		
//		System.out.println("Controller searchType : " + searchType);
//		System.out.println("Controller keyword : " + keyword);
		System.out.println("Controller istate : " + istate);
		
		ItemListView itemListView = null;
		
		if(istate.equals("1")) {
			itemListView = listService.getItemRList(request);
		} else if (istate.equals("0")) {
			itemListView = listService.getItemList(request);
		} else {
			itemListView = listService.getItemList(request);
		}
		
		return itemListView;
	}
	
}
