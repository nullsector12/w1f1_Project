package wifi.order.solo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import wifi.order.solo.model.ItemRegRequest;
import wifi.order.solo.service.ItemRegService;

@RestController
@RequestMapping("/regItem")
public class ItemRegController {

	@Autowired
	private ItemRegService regService;
	
	@PostMapping
	public int regItem (ItemRegRequest regRequest, HttpServletRequest request ) {
		
		return regService.regItem(regRequest, request);
	}
	
}
