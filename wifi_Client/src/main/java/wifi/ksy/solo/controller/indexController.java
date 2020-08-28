package wifi.ksy.solo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	
	@RequestMapping(value="/")
	public String home() {
		
		return "board/itemList";
	}

}
