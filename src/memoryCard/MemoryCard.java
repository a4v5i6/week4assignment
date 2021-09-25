package memoryCard;

public class MemoryCard {
	public int id;
	public String action;

	public MemoryCard(int id, String action)
	{
		this.id = id;
		this.action = action;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
}
