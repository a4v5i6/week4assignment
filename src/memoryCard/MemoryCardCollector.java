package memoryCard;

public class MemoryCardCollector implements MemoryCardAbstractCollector {

    static final int MAX = 3;
    int items = 0;
    MemoryCard[] memoryCardList;
  
    public MemoryCardCollector()
    {
        memoryCardList = new MemoryCard[MAX];
  
        // Let us add some dummy notifications
        addItem(1, "Copy form MemoryCard");
        addItem(2, "Paste into MemoryCard");
        addItem(3, "Insert MemoryCard");
    }
  
    public void addItem(int id, String act)
    {
        MemoryCard memoryCard = new MemoryCard(id, act);
        if (items >= MAX)
            System.err.println("Full");
        else
        {
            memoryCardList[items] = memoryCard;
            items = items + 1;
        }
    }
  
	@Override
	public MemoryCardAbstractIterator getIterator() {
		return new MemoryCardIterator(memoryCardList);
	}

}
