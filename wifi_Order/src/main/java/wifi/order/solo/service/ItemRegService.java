package wifi.order.solo.service;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import wifi.order.solo.dao.ItemDao;
import wifi.order.solo.model.Item;
import wifi.order.solo.model.ItemRegRequest;

@Service
public class ItemRegService {
	
	private ItemDao dao;
	
	@Autowired
	private SqlSessionTemplate template;

	public int regItem (ItemRegRequest regRequest, HttpServletRequest request) {
		
		dao = template.getMapper(ItemDao.class);
		
		int result = 0;
		
		Item item = regRequest.toItem();
		
		result = dao.insertItem(item);
		System.out.println("item Reg result : " + result);
		
		
		return result;
	}
	
	
}
