package wifi.ksy.solo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping(value="wifi/orderview")
	public String itemRegForm() {
		
		return "board/orderview";
	}

}
