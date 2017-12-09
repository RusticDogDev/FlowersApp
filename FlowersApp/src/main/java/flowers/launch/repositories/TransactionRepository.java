package flowers.launch.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import flowers.launch.models.Bouquet;
import flowers.launch.models.Transaction;

public interface TransactionRepository extends MongoRepository<Transaction, Integer> 
{
	public List<Bouquet> findByTransId(Long transId);
}
