public class StackDecorator2 extends StackDecorator1 {
	
	//Overide
	public void Push(Object x) {
		System.out.println("True");
		super.Push(x);
	}
	
	//Overide
	public Object Pop() {
		
		if(list.size() > 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		return super.Pop();
	}
	
	//Overide
	public Object Top() {
		if(list.size() > 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		return super.Top();
	}
	
	//Overide
	public int Length() {
		System.out.println("True");
		return super.Length();
	}
}