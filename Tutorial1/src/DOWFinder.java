
public class DOWFinder {
	public static void main(String[] args) {
		findDOW(28,1,2021);
	}
	public static void findDOW(int day, int month, int year)
	{
		int month_days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int numDays = 0;
		numDays = (year-1900)*365;
		numDays += (year-1900)/4;
		
		if((year%400==0 || year%4==0) && (month==1 || month==2))
		{
			numDays -= 1;
		}
		for(int i=0; i<month-1; i++)
		{
			numDays += month_days[i];
		}
		numDays += day;
		
		int res = numDays%7;
		System.out.println(res);
		
		if(res==0)
			System.out.println("Sunday");
		else if(res==1)
			System.out.println("Monday");
		else if(res==2)
			System.out.println("Tuesday");
		else if(res==3)
			System.out.println("Wednesday");
		else if(res==4)
			System.out.println("Thursday");
		else if(res==5)
			System.out.println("Friday");
		else if(res==6)
			System.out.println("Saturday");
	}
}
