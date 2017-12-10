package flowers.launch.repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import flowers.launch.models.Package;

public interface PackageRepository extends MongoRepository<Package, Integer>
{
	public List<Package> findByPackId(Long packId);
}
