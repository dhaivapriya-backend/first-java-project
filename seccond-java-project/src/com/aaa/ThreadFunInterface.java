package com.aaa;

public class ThreadFunInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1=new Runnable() {
		public void run()
		{
			System.out.println("Threa1 is Running...");
		}

	};
	
	Thread t1=new Thread(r1);
	t1.start();
	
	
	Runnable r2=()->{
		System.out.println("Thread2 is Running...");
	};
	
	Thread t2=new Thread(r2);
	t2.start();

}
}
