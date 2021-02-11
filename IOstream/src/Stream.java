import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		List<String> sList = Arrays.asList("hi","hello","Rakuten","India");
		
//		for(String s:sList)
//		{
//			System.out.println("  "+s);
//		}
		sList.stream().map(x -> "  "+x).forEach(System.out :: println);
		
		sList.stream().forEach(System.out :: println);
		
		List<String> excitingWords = sList.stream().map(s -> s+"!").collect(Collectors.toList());
		List<String> excitingWords1 = sList.stream().map(String:: toUpperCase).collect(Collectors.toList());
		System.out.println(excitingWords);
		System.out.println(excitingWords1);
		
		Optional<String> string_combine = sList.stream().map(String:: toUpperCase).reduce((s1,s2)->s1+s2);
		
		if(string_combine.isPresent())
			System.out.println(string_combine.get());
		
		System.out.printf("Original words: %s.%n", sList);
	    //  Stream<String> wordStream = words.stream();  NO!! Why not?
	    
	    String upperCaseWords = 
	        sList.stream().reduce("", (s1, s2) -> s1.toUpperCase() 
	                                              + s2.toUpperCase());
	    System.out.printf("Single uppercase String: %s.%n", 
	                      upperCaseWords);
	    
	    String upperCaseWords2 = 
	        sList.stream().map(String::toUpperCase)     // Or .map (s -> s.toUpperCase())
	                      .reduce("", String::concat);  // Or .reduce("", (s1,s2) -> s1+s2)
	    System.out.printf("Single uppercase String: %s.%n", 
	                      upperCaseWords2);
	    
	    String wordsWithCommas = 
	        sList.stream().reduce((s1, s2) -> s1 + "," + s2)
	                      .orElse("need at least two strings");
	    System.out.printf("Comma-separated String: %s.%n", 
	                      wordsWithCommas);
	    
	    int numberOfChars =
	        sList.stream().mapToInt(String::length)
	                      .sum();
	    System.out.printf("Total number of characters: %s.%n", 
	                      numberOfChars);
	    
	    long numberOfWordsWithH =
	        sList.stream().filter(s -> s.contains("h"))
	                      .count();
	    System.out.printf("Number of words containing 'h': %s.%n", 
	                      numberOfWordsWithH);
	}

}
