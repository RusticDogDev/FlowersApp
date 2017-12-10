package flowers.launch.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import flowers.launch.repositories.BouquetRepository;
import flowers.launch.repositories.FlowerRepository;
import flowers.launch.repositories.ItemRepository;
import flowers.launch.repositories.PackageRepository;
import flowers.launch.repositories.TransactionRepository;
import flowers.launch.repositories.UserRepository;

public class DataLoader implements ApplicationRunner{
	
	@Autowired 
	BouquetRepository bouquetRepository;
	@Autowired
	FlowerRepository flowerRepository;
	@Autowired
	ItemRepository itemRepository;
	@Autowired
	PackageRepository packageRepository;
	@Autowired
	TransactionRepository transactionRepository;
	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		userRepository.save(new User((long) 1123432,"regular", "kieran","guess"));
		bouquetRepository.save(new Bouquet((long) 1123432,"halloweenBouquet", "r1o3c1"));		
	}


}
