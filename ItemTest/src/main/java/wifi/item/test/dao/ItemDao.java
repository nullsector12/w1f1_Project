package wifi.item.test.dao;

import java.util.List;
import java.util.Map;

import wifi.item.test.model.Item;
import wifi.item.test.model.MyItem;

public interface ItemDao {

	// 게시물 등록
	int insertItem(Item item);
	
	// 게시물 리스트 출력
	List<MyItem> selectList (Map<String, Object> search);
	// List<MyItem> selectRList (Map<String, Object> search);

	int totalCount(Map<String, Object> search);

	Item selectByIidx(int iidx);

	void increaseViewCount(int iidx);
	
	
}
