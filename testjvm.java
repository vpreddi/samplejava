package puzzlers;

public class Testjvm extends Thread {
	
	Testjvm()
	{
		start();
	}

	public static void main(String[] args) {
		Testjvm test = new Testjvm();
		 System.out.println("in main thread----------------"+Thread.currentThread().getName()+"----"+Thread.currentThread().getId()+"----"+Thread.currentThread().getPriority());
	}

   public void run()
   {
	   System.out.println("in another thread----------------"+Thread.currentThread().getName()+"----"+Thread.currentThread().getId()+"----"+Thread.currentThread().getPriority());
	   
   }
}