@FunctionalInterface
public interface TwoElementPredicate<T> {
	
	public boolean isFirstBetterThanSecond(T s1, T s2);
}
