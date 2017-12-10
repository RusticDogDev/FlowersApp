package flowers.launch.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import flowers.launch.models.Item;

public interface ItemRepository extends MongoRepository<Item, Integer>
{
	public List<Item> findByItemId(Long itemId);
	List<Item> findAllByItemType(String itemType);
	Item findOne(Long itemId);
	@SuppressWarnings("unchecked")
	Item save (Item it);
	int update(Item it);
	@Query
	int deleteOne(Long itemId);
}
