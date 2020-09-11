package wifi.item.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wifi.item.test.model.Item;
import wifi.item.test.model.ItemListView;
import wifi.item.test.model.ItemRegRequest;
import wifi.item.test.service.ItemInfoService;
import wifi.item.test.service.ItemListViewService;
import wifi.item.test.service.ItemRegService;


@RestController
@RequestMapping("/items")
public class ItemRestController {

	@Autowired
	private ItemRegService regService;
	
	@Autowired
	private ItemListViewService listService;
	
	@Autowired
	private ItemInfoService infoService;
	
	@PostMapping
	public int regItem (ItemRegRequest regRequest, HttpServletRequest request ) {
		
		System.out.println("아이템 리퀘스트 확인 : " + regRequest);
		System.out.println("리퀘스트 확인 : " + request);
		
		return regService.regItem(regRequest, request);
	}
	
	
	@GetMapping
	public ItemListView getItemList (HttpServletRequest request) {
		

		String istate = request.getParameter("istate");

		if(istate==null) {
			istate = "널";
		}
		
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
	
	@GetMapping("/{iidx}")
	public Item getItemInfo(@PathVariable("iidx") int iidx) {
		
		return infoService.getItemInfo(iidx);
	}
	
}
