package flowers.launch.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long transId;
	private int cost;
	private Long packId;
	private Long userId;
	
	public Transaction() {}
	
	public Transaction(Long transId, int cost, Long packId, Long userId) 
	{
		super();
		this.setTransId(transId);
		this.setCost(cost);
		this.setPackId(packId);
		this.setUserId(userId);
	}

	public Long getTransId() {
		return transId;
	}

	public void setTransId(Long transId) {
		this.transId = transId;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Long getPackId() {
		return packId;
	}

	public void setPackId(Long packId) {
		this.packId = packId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	@Override
    public String toString() {
        return String.format(
                "Transaction[transId=%d, cost=%d, packId=%d, userId=%d]",
                transId, cost, packId, userId);
    }

}
