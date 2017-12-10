package flowers.launch.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import flowers.launch.models.Transaction;

public interface TransactionRepository extends MongoRepository<Transaction, Integer> 
{
	public List<Transaction> findByTransId(Long transId);
}
