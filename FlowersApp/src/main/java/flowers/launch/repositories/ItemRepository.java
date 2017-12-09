package flowers.launch.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import flowers.launch.models.Bouquet;
import flowers.launch.models.Item;

public interface ItemRepository extends MongoRepository<Item, Integer>
{
	public List<Bouquet> findByItemId(Long itemId);
}
