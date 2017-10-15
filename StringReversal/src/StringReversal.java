import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
	
		System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        char[] ch=s.toCharArray();
        
        for(int i=0;i<ch.length-1;i++)
        {
        	ch[i]=s.charAt(i);
        }
        for(int i=ch.length-1;i>=0;i--)
        {
        	System.out.println(ch[i]);
        }
		
	}

}
