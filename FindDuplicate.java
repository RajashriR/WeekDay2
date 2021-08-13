package Selenium;

public class FindDuplicate {

	public static void main(String[] args) {
	int arr[] = {12,1,15,13,43,1,18,12,43,9,54,9};
	System.out.println("THe duplicate value is :");
	for (int i =0; i<arr.length; i++)
	{
		for (int j= i+1; j<arr.length ;j++)
		{
			if (arr[i] == arr[j])
			{
				System.out.println(arr[i]);
			}
		}
	}

	}

}
