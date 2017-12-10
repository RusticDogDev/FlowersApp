package flowers.launch.services;

import java.util.List;
import flowers.launch.models.Bouquet;

public interface BouquetService {

	public List<Bouquet> findAll();

	public Bouquet getById(String id);

	public Bouquet getByName(String name);
}
