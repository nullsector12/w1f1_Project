package wifi.ksy.solo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping(value="wifi/itemRegForm")
	public String itemRegForm() {
		
		return "board/itemRegForm";
	}

	@RequestMapping(value="/itemList")
	public String itemListView() {
		return "board/itemList";
	}
	
}
