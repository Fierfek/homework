import java.util.*;

public class StackImpl extends Observable implements Stack {
	Object temp;
	ArrayList<Object> list = new ArrayList(); 
	
	public void Push(Object x) {
		list.add(x);
		
		setChanged();
		notifyObservers("Changed!");
	}
	
	public Object Pop() {
		if(list.size() > 0) {
			temp = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			
			setChanged();
			notifyObservers("Changed!");
			
			return temp;
		}
		
		return null;
	}
	
	public Object Top() {
		if(list.size() > 0) {
			return list.get(list.size() - 1);
		}
		return null;
	}
	
	public int Length() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}