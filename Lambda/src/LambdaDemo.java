import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class LambdaDemo {

	public static int eChecker(String s1, String s2)
	{
		if(s1.contains("e") && !s2.contains("e"))
		{
			return -1;
		}
		else if(!s1.contains("e") && s2.contains("e"))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static String betterString(String s1, String s2, TwoStringPredicate decider)
	{
		if(decider.isFirstBetterThanSecond(s1, s2))
			return s1;
		
		return s2;
		
	}
	
	public static <T> T betterElement(T s1, T s2, TwoElementPredicate<T> decider)
	{
		if(decider.isFirstBetterThanSecond(s1, s2))
			return s1;
		
		return s2;
	}
	
	
	
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>();
		sList.add("zabsbbc");
		sList.add("efg");
		sList.add("hijkl");
		sList.add("mnoepq");
		
		Collections.sort(sList,(s1,s2) -> s1.length()-s2.length());
		System.out.println(sList);
		
		Collections.sort(sList, LambdaDemo:: eChecker);
		System.out.println(sList);
		
		String lengthier = betterString("hi","hello", (s1,s2)->s1.length() > s2.length());
		System.out.println(lengthier);
		
		String lengthier1 = betterElement("hi","hello", (s3,s4)->s3.length() > s4.length());
		System.out.println(lengthier1);
		
		
		

	}
	
	
}
	


