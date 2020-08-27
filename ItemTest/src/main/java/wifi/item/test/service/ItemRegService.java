package wifi.item.test.service;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import wifi.item.test.dao.ItemDao;
import wifi.item.test.model.Item;
import wifi.item.test.model.ItemRegRequest;



public class ItemRegService {
	
	private ItemDao dao;
	
	@Autowired
	private SqlSessionTemplate template;

	public int regItem (ItemRegRequest regRequest, HttpServletRequest request) {
		
		dao = template.getMapper(ItemDao.class);
		
		int result = 0;
		
		Item item = regRequest.toItem();
		
		result = dao.insertItem(item);
		
		return result;
	}
}
