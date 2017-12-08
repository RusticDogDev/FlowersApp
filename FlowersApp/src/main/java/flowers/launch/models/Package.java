package flowers.launch.models;

public class Package {
	
	private Long packId;
	private String packType;
	private Long bouId;
	private Long itemId;
	
	public Package(Long packId, String packType, Long bouId, Long itemId) 
	{
		super();
		this.setPackId(packId);
		this.setPackType(packType);
		this.setBouId(bouId);
		this.setItemId(itemId);
	}

	public Long getPackId() {
		return packId;
	}

	public void setPackId(Long packId) {
		this.packId = packId;
	}

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}

	public Long getBouId() {
		return bouId;
	}

	public void setBouId(Long bouId) {
		this.bouId = bouId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

}
