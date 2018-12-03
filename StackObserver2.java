import java.util.Observer;
import java.util.Observable;

public class StackObserver2 implements Observer {
	
	public void update(Observable o, Object object) {
		if(object instanceof String && o instanceof StackImpl) {
			if(((String)object) == "Changed!") {
				System.out.println(((StackImpl) o).toString());
			}
		}
	}
}