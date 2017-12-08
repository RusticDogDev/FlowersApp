package flowers.launch.models;

public class Bouquet 
{
	
	private Long bouId;
	private String bouType;
	private String flowers;
	
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
	


}
