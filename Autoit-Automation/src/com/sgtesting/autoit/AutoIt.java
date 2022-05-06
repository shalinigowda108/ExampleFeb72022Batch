package com.sgtesting.autoit;

public class AutoIt {

	public static void main(String[] args) {
		executeAutoIt();
	}
		private static void executeAutoIt()
		{
			try 
			{
				Runtime.getRuntime().exec("D:\\AutoIt\\example.exe");
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}

}
