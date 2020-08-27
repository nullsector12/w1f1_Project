package wifi.item.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wifi.item.test.model.ItemRegRequest;
import wifi.item.test.service.ItemRegService;


@RestController
@RequestMapping("/items")
public class ItemRegController {

	@Autowired
	private ItemRegService regService;
	
	@PostMapping
	public int regItem (ItemRegRequest regRequest, HttpServletRequest request ) {
		
		return regService.regItem(regRequest, request);
	}
	
}
