package flowers.launch.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Package {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long packId;
	private String packType;
	private Long bouId;
	private Long itemId;
	
	protected Package() {}
	
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
	
	@Override
    public String toString() {
        return String.format(
                "Package[packId=%d, packType='%s', bouId=%d', itemId='%d']",
                packId, packType, bouId, itemId);
    }

}
