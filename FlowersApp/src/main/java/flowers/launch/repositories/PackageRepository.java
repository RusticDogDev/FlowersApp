package flowers.launch.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import flowers.launch.models.Package;

public interface PackageRepository extends MongoRepository<Package, Integer>
{
	public List<Package> findByPackId(Long packId);
	List<Package> findAllByPackType(String packType);
	Package findOne(Long packId);
	@SuppressWarnings("unchecked")
	Package save (Package pac);
	int update(Package pac);
	@Query
	int deleteOne(Long packId);
}
