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
		bouquetRepository.save(new Bouquet((long) 1,"halloweenBouquet", "Orange Roses, Purple Monte Casino", 45));
		bouquetRepository.save(new Bouquet((long) 2,"christmasBouquet", " Holly, Spruce", 50));
		bouquetRepository.save(new Bouquet((long) 3,"valentinesdayBouquet", "Red Roses", 30));
		bouquetRepository.save(new Bouquet((long) 4,"easterBouquet", "Easter lillies, Tulips", 40));
		bouquetRepository.save(new Bouquet((long) 5,"valentinesdayBouquet2", "Yellow Roses", 30));
		bouquetRepository.save(new Bouquet((long) 6,"valentinesdayBouquet3", "Blue Roses", 30));
		itemRepository.save(new Item((long) 1,"teddybear", "", 5));
		itemRepository.save(new Item((long) 2,"chocolates", "", 7));
		itemRepository.save(new Item((long) 3,"candy", "", 8));
		itemRepository.save(new Item((long) 4,"card", "i wuv u", 4));
		packageRepository.save(new Package((long) 1,"halloweenPackage", (long) 1, (long) 3));
		packageRepository.save(new Package((long) 2,"christmasPackage", (long) 2, (long) 1));
		packageRepository.save(new Package((long) 3,"easterPackage", (long) 4, (long) 1));
		packageRepository.save(new Package((long) 4,"valentinesPackage1", (long) 3, (long) 1));
		packageRepository.save(new Package((long) 5,"valentinesPackage2", (long) 5, (long) 4));
		packageRepository.save(new Package((long) 6,"valentinesPackage3", (long) 6, (long) 2));
	}


}
