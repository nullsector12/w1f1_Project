package wifi.ksy.solo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import wifi.ksy.solo.service.NameCheckService;



@Controller
public class NameCheckController {
	
	@Autowired
	NameCheckService nameCheckService;
	
	
	
	@ResponseBody
	@RequestMapping(value="/nameCheck")
	public String nameCheck (
			@RequestParam("name") String name
			) {
		
		
		return nameCheckService.checkName(name);
	}
	
	

}
