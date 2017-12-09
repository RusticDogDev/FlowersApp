package flowers.launch.models;

public class Item 
{
	private Long itemId;
	private String itemType;
	private String message;
	private int itemCost;
	
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


}

