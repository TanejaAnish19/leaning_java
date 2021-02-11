import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericsDemo {


	public static <T> void sort(List<T> l,Comparator<? super T> c) {
		
	}

	public static <T> T  findAnInterestingElement(List<T> l) {
		return null;
	}
	
	
	public static void printAll(List<?> l) {
		//print
//		l.add("abc");
	}
	
	public static double sum(List<? extends Number> numList) {
		double sum = 0;
		for(Number i : numList) {
			sum += i.doubleValue();
		}
//		numList.add(123f);
		return sum;
	}
		
	public static void main(String[] args) {
		List<Integer> iList = new ArrayList<Integer>();
		
		iList.add(123);
		iList.add(234);
		
		printAll(iList);
		for(Integer i : iList) {
			System.out.println(i);
		}
		
		Integer s = findAnInterestingElement(iList);
//		double sum = sum(iList);
//		System.out.println(sum);
//		
//		List<Double> dList = new ArrayList<>();
//		dList.add(12.12);
		
//		sum(dList);
		//iList.add("abc");
		
		Integer i = 2;
		Object o = i;
//		
//		List<Object> ol = iList;
//		ol.add("abc");
//		List<Object> oList = new ArrayList<Object>(iList);

	}
}
