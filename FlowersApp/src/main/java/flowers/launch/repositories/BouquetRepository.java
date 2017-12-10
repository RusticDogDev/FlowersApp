package flowers.launch.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import flowers.launch.models.Bouquet;

public interface BouquetRepository extends MongoRepository<Bouquet, Integer>
{
	public List<Bouquet> findByBouId(Long bouId);
}
	
