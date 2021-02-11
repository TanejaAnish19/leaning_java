import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaGeneric {

	
	public static <T> List<T> allMatches(List<T> words, Predicate<T>decider)
	{
		List<T>res = new ArrayList<>();
		for(T s:words)
		{
			if(decider.test(s))
				res.add(s);
		}
		return res;
	}
	
	public static void main(String[] args) {

		List<String> words = Arrays.asList("hi","hello","bag","Rakuten");
		System.out.println(words);
		
		List<String> result = new ArrayList<String>();
		result = allMatches(words, s -> s.length()<4);
		System.out.println(result);
		
		result = allMatches(words, s -> s.contains("b"));
		System.out.println(result);
		
		result = allMatches(words, s -> (s.length()%2)==0);
		System.out.println(result);
		
		
		List<Integer> nums = Arrays.asList(1,10,100,1000);
		List<Integer> bigNums = new ArrayList<>();
		
		bigNums = allMatches(nums, n-> n > 500);
		System.out.println(bigNums);
		
	}
}
