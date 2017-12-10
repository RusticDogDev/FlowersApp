package flowers.launch.repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import flowers.launch.models.Flower;

public interface FlowerRepository extends MongoRepository<Flower, Integer>
{

}
