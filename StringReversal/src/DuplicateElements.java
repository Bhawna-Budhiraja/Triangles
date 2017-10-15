import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		char[] ch=s.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		Set<Character> charSet=map.keySet();
		for(char t:charSet)
		{
			if(map.get(t)>1)
			{
				System.out.println(t+"-->"+map.get(t));
			}
			
		}

	}

}
