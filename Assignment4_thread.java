package assignment4_thread;

public class Assignment4_thread extends Thread{
    
	Assignment4_thread(){		
		//System.out.println("Invoking the another thread..");
		start();		
	}
	
	public void run()
	{
		try
		{			
			int num;
			for (num = 1; num <= 10; num++)
				System.out.println(5 + " * " + num + " = " + num * 5);
		}
		catch (Exception ex)
		{
			System.out.println("Exception is : " + ex);
		}
	}

	//main function.
	public static void main (String args[])
	{		
		new Assignment4_thread();
		
		
		try
		{
			
			Thread.sleep(1000); //The sleep() method of Thread class is used to sleep a thread for the specified amount of tim
			
			//System.out.println("Starting the main thread...");
			for (int num = 0; num <= 40; num += 2)
			{
				
				System.out.println("");
				System.out.println("Main Thread " +num);
				Thread.sleep(500);
			}
		}
		catch (Exception ex)
		{
			System.out.println("Exception is : "+ex);
		}
	}
    }