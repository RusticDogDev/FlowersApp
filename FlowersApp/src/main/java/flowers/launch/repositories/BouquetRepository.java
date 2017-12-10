package flowers.launch.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import flowers.launch.models.Bouquet;

public interface BouquetRepository extends MongoRepository<Bouquet, Integer>
{
	public List<Bouquet> findByBouId(Long bouId);
	List<Bouquet> findAllByBouType(String bouType);
	Bouquet findOne(Long bouId);
	@SuppressWarnings("unchecked")
	Bouquet save (Bouquet bou);
	int update(Bouquet bou);
	@Query
	int deleteOne(Long bouId);
}
	
