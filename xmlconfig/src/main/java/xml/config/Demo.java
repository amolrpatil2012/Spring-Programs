package xml.config;
class MyThread extends Thread
{
    public void run()
    {
      System.out.println("Running");  
    }
}
public class Demo {

	    public static void main(String args[]) {
	    	Runnable r = new MyThread();
	        Thread t = new Thread(r);
	        t.start();
	    }
	

	

}
