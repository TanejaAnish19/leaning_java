
@FunctionalInterface
// This interface can have only one abstract method and multiple default methods. This interface is used to implement Lambda Functions.
public interface TwoStringPredicate {

	public boolean isFirstBetterThanSecond(String s1, String s2);
	
	public default void ting()
	{
		System.out.println("ting");
	}
}
