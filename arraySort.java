package Selenium;

import java.util.Arrays;

public class arraySort {
	public static void main(String[] args)
	{
		//Initialize the array
		int[] arrNum = {34,203,5,78,100,1000,1};
	
		//Sort the array
		Arrays.sort(arrNum);
		
		//Print last element of the array
		System.out.println("Largest Array :" +arrNum[arrNum.length-1]);
		
		
		//Print second largest array
		System.out.println("second Largest Array :" +arrNum[arrNum.length-2]);
		
		
	}
	
}
