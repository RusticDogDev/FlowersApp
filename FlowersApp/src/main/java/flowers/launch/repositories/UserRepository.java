package flowers.launch.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import flowers.launch.models.User;

public interface UserRepository extends MongoRepository<User, Integer>
{
	public List<User> findByUserName(String userName);
	User findOne(Long userId);
	@SuppressWarnings("unchecked")
	User save (User usr);
	int update(User usr);
	@Query
	int deleteOne(Long userId);
}
