package flowers.launch.services;

import java.util.List;
import flowers.launch.models.User;

public interface UserService {
	
	public List<User> findAll();
	public User getById(String id);
	public User getByName(String name);

}
