package threadfunction;

class A extends Thread{
	
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Odd");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread{
	
	@Override
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Even");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadFunctionEx {
	
	public static void main(String[] args) {
		
		A thread1 = new A();
		B thread2 = new B();
		
		
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		
		thread1.setName("Th1");
		thread1.setName("Th2");
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		
	
		thread1.start();
		
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		thread2.start();
		
		System.out.println("End.....");
	}
}
