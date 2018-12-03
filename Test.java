public class Test {
	public static void main(String args[]) {
		StackDecorator2 d2 = new StackDecorator2();
		
		StackObserver1 o1 = new StackObserver1();
		StackObserver2 o2 = new StackObserver2();
		
		d2.addObserver(o1);
		d2.addObserver(o2);
		
		System.out.println("Adding the element 1");
		d2.Push(1);
		
		System.out.println("\nAdding the element 2");
		d2.Push(2);
		
		System.out.println("\nAdding the element 10");
		d2.Push(10);
		
		System.out.println("\nPeeking the stack");
		d2.Top();
		
		System.out.println("\nPoping the stack");
		d2.Pop();
		
		System.out.println("\nPoping the stack");
		d2.Pop();
		
		System.out.println("\nPoping the stack");
		d2.Pop();
		
		System.out.println("\nPoping the stack");
		d2.Pop();
	}
}