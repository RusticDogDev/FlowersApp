package flowers.launch.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item 
{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long itemId;
	private String itemType;
	private String message;
	private int itemCost;
	
	protected Item() {}
	
	public Item(Long itemId, String itemType, String message, int itemCost) 
	{
		super();
		this.setItemId(itemId);
		this.setItemType(itemType);
		this.setMessage(message);
		this.setItemCost(itemCost);
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getItemCost() {
		return itemCost;
	}

	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}
	
	@Override
    public String toString() {
        return String.format(
                "Item[itemId=%d, itemType='%s', message='%s', itemCost=%d]",
                itemId, itemType, message, itemCost);
    }


}

