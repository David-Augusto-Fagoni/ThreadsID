package controller;

public class ThreadsID extends Thread {
	
	private int ID;
	public ThreadsID(int ID)
	{
		this.ID = ID;
	}
	public void run()
	{
		System.out.println("A Thread "+ID+" tem o ID: #"+getId());
	}
}
