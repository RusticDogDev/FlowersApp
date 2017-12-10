package flowers.launch.services;

import java.util.List;
import flowers.launch.models.Flower;

public interface FlowerService {
	
	public List<Flower> findAll();
	public Flower getById(String id);
	public Flower getByName(String name);
	
}
