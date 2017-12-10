package flowers.launch.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bouquet 
{
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long bouId;
	private String bouType;
	private String flowers;
	
	protected Bouquet() {}
	
	public Bouquet(Long bouId, String bouType, String flowers) 
	{
		super();
		this.setBouId(bouId);
		this.setBouType(bouType);
		this.setFlowers(flowers);
	}
	
	public Long getBouId() {
		return bouId;
	}

	public void setBouId(Long bouId) {
		this.bouId = bouId;
	}

	public String getBouType() {
		return bouType;
	}

	public void setBouType(String bouType) {
		this.bouType = bouType;
	}

	public String getFlowers() {
		return flowers;
	}

	public void setFlowers(String flowers) {
		this.flowers = flowers;
	}
	
	@Override
    public String toString() {
        return String.format(
                "Bouquet[bouId=%d, bouType='%s', flowers='%s']",
                bouId, bouType, flowers);
    }
	


}
