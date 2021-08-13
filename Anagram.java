package Selenium;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="silent";
		String str2="listen";
		if (str1.length() == str2.length())
		{
			char[] char1 = str1.toCharArray();
			char[] char2 = str2.toCharArray();
		//Sorting arrays
			Arrays.sort(char1);
		    Arrays.sort(char2);
		if (Arrays.equals(char1,char2))
		{
			System.out.println("SILENT and LISTEN are Anagram" );
		}
		else 
			System.out.println("SILENT and LISTEN are not Anagram");
		}

	}

}
