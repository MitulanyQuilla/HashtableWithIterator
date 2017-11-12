import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class HashtableWithIterator {
	
	public static void main (String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		hashtable.put(5,  "Andres");
		hashtable.put(10, "Rubiano");
		hashtable.put(15, "Mauricio");
		hashtable.put(20, "Del");
		hashtable.put(25, "Chiaro");
		
		Set set = hashtable.entrySet();
		Iterator i = set.iterator();
		
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print("Key: " + me.getKey());
			System.out.println(" | value: " + me.getValue());
		}
	}	
}
