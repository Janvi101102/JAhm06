package methodoverriding;

public class Child extends Parent{
	
	@Override
	public void sayHello(String msg) {
		super.sayHello("I am Parent");
		System.out.println("Hi I am Child " + msg);
	}
}
