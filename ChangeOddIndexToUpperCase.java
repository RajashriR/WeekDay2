package Selenium;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
					
		//	 * Declare String Input as Follow
			   String text="changeme";
			
			 
			// * a) Convert the String to character array
			 String[] chars = text.split("");
			 String out = "";
			// * b) Traverse through each character (using loop)
			for (int i=0; i < chars.length; ++i) 
			{
				if( i %2 == 0)
				{
					out = out + chars[i].toUpperCase(); 
					System.out.println("The upper case = "+out );
				}
				else
				{
					out = out + chars[i].toLowerCase();
					System.out.println("The Lower case = "+out );
				}
			}
					 
		}
	}

