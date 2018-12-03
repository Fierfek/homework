public class StackDecorator1 extends StackImpl {
	
	//Overide
	public void Push(Object x) {
		System.out.println("Push");
		super.Push(x);
	}
	
	//Overide
	public Object Pop() {
		System.out.println("Pop");
		return super.Pop();
	}
	
	//Overide
	public Object Top() {
		System.out.println("Top");
		return super.Top();
	}
	
	//Overide
	public int Length() {
		System.out.println("Length");
		return super.Length();
	}
}