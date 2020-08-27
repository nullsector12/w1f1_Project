package wifi.order.solo.dao;

import wifi.order.solo.model.File;
import wifi.order.solo.model.Item;

public interface ItemDao {

	int insertItem(Item item);
	
	int insertFile(File file);
	
}
