package View;

import controller.ThreadsID;

public class Main {
	public static void main (String args[])
	{
		for (int i = 0; i < 5 ;i++)
		{
			 ThreadsID ID = new ThreadsID(i);
			 ID.start();
		}
	}
}
