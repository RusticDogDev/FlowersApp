package flowers.launch.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import flowers.launch.models.Bouquet;
import flowers.launch.models.Package;

public interface PackageRepository extends MongoRepository<Package, Integer>
{
	public List<Bouquet> findByPackId(Long packId);
}
