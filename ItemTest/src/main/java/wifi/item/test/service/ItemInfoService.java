package wifi.item.test.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wifi.item.test.dao.ItemDao;
import wifi.item.test.model.Item;

@Service
public class ItemInfoService {

	private ItemDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public Item getItemInfo(int iidx) {
		
		dao = template.getMapper(ItemDao.class);
		
		Item item = dao.selectByIidx(iidx);
		
		dao.increaseViewCount(iidx);
		
		return item;
	}
}
