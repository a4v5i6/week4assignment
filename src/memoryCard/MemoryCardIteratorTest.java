package memoryCard;

public class MemoryCardIteratorTest {

	public static void main(String args[])
    {
	
	 MemoryCardCollector memoryCards = new MemoryCardCollector() ;
	 MemoryCardAbstractIterator iterator = memoryCards.getIterator();
     System.out.println("Different Types of MemoryCards:");
     while (iterator.hasnext())
     {
         MemoryCard h = (MemoryCard)iterator.next();
         System.out.println(h.getId()+ ". "+h.getAction());
     }
}
}