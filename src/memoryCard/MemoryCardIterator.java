package memoryCard;

public class MemoryCardIterator implements MemoryCardAbstractIterator {

	MemoryCard[] memoryCardList;
	public int index = 0;
	public MemoryCardIterator(MemoryCard[] memoryCardList) {

		this.memoryCardList = memoryCardList;
	}

	@Override
	public boolean hasnext()
	{		
		if (index >= memoryCardList.length ||
		memoryCardList[index] == null)
	            return false;
	        else
	            return true;
	 }

	@Override
	public Object next() {
		 MemoryCard ham =  memoryCardList[index];
	        index += 1;
	        return ham;
	}

}
