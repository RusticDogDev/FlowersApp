package flowers.launch.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import flowers.launch.repositories.BouquetRepository;
import flowers.launch.repositories.ItemRepository;
import flowers.launch.repositories.PackageRepository;
import flowers.launch.repositories.TransactionRepository;
import flowers.launch.repositories.UserRepository;

public class DataLoader implements ApplicationRunner{
	
	@Autowired 
	BouquetRepository bouquetRepository;
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
		userRepository.save(new User((long) 1,"regular", "kieran","guess"));
		userRepository.save(new User((long) 2,"regular", "dan","goat"));
		bouquetRepository.save(new Bouquet((long) 1,"halloweenBouquet", "Roses, Lillies", 45));
		bouquetRepository.save(new Bouquet((long) 2,"christmasBouquet", "Roses, Lillies", 50));
		bouquetRepository.save(new Bouquet((long) 3,"valentinesdayBouquet", "Roses, Lillies", 30));
		itemRepository.save(new Item((long) 1,"teddybear", "", 5));
		itemRepository.save(new Item((long) 2,"chocolates", "", 7));
		itemRepository.save(new Item((long) 3,"candy", "", 8));
		itemRepository.save(new Item((long) 4,"card", "i wuv u", 4));
	}


}
