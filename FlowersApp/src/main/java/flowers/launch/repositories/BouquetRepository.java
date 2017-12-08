package flowers.launch.repositories;

import java.util.List;

public interface BouquetRepository {
	
	List<ItemsOwned> findAllByUser(Long id);
	List<ItemsOwned> findAllByItem(Long itemId);
	ItemsOwned save(ItemsOwned io);
	int deleteOne(ItemsOwned io);
