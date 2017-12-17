package flowers.launch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flowers.launch.models.Package;
import flowers.launch.repositories.PackageRepository;

@Service
public class PackageServiceImpl implements PackageService{
	@Autowired
	private PackageRepository packageRepository;

	public PackageServiceImpl(PackageRepository productRepository) {
		this.packageRepository = productRepository;
	}
	
	@Override
	public List<Package> findAll() {
		List<Package> productList = packageRepository.findAll();
		return productList;
	}

	@Override
	public Package getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Package getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}	
}
