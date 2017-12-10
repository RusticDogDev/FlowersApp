package flowers.launch.services;

import java.util.List;
import flowers.launch.models.Transaction;

public interface TransactionService {
	
	public List<Transaction> findAll();
	public Transaction getById(String id);
	public Transaction getByName(String name);

}
