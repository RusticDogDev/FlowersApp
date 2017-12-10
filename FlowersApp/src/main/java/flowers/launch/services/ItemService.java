package flowers.launch.services;

import java.util.List;
import flowers.launch.models.Item;

public interface ItemService {
	
	public List<Item> findAll();
	public Item getById(String id);
	public Item getByName(String name);

}
