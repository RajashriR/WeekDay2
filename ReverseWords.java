package Selenium;

public class ReverseWords {

	public static void main(String[] args) {
		String test = "Think Positive";
		
		String[] word = test.split(" ");
		
		String rev="";
		
		for(int i=0; i<word.length; i++)
		{
			String words  = word[i];
			
			String revword="";
			
			for (int j=words.length()-1;j>=0; j--)
			{
				revword=revword+words.charAt(j);
							}
			
			rev= rev+revword+" ";
			
			
		}
		System.out.println("The sentence is :"+test);
		System.out.println("The reverse of the sentence is :"+rev);
				
			}


	}

