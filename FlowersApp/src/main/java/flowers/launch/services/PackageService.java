package flowers.launch.services;

import java.util.List;
import flowers.launch.models.Package;

public interface PackageService {
	
	public List<Package> findAll();
	public Package getById(String id);
	public Package getByName(String name);

}
