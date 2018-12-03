import java.util.Observer;
import java.util.Observable;

public class StackObserver1 implements Observer {
	
	public void update(Observable o, Object object) {
		if(object instanceof String) {
			if(((String)object) == "Changed!") {
				System.out.println("Changed!");
			}
		}
	}
}