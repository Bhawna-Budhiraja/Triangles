import java.util.Arrays;
import java.util.Scanner;

public class checkAnagrams {
	
	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String anagram="file";
		char[] ch=s.toLowerCase().toCharArray();
		char[] ch1=anagram.toLowerCase().toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if(Arrays.equals(ch, ch1))
		{
			System.out.println("Two Strings are anagrams of each other");
		}
		else 
		{
			System.out.println("Two strings are not anagrams of each other");
		}
		
		
		
		
	}

}
