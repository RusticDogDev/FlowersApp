package flowers.launch.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import flowers.launch.models.User;

public interface UserRepository extends MongoRepository<User, Integer>
{
	public List<User> findByUserName(String userName);
}
