import java.util.Scanner;
class  CalendarSumForwardMonth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("     SumDayForward");
		System.out.print("daystart : ");			int dd =sc.nextInt();
		System.out.print("monthstart : ");			int mm =sc.nextInt();
		System.out.print("Thai Yearstart : ");		int yy =sc.nextInt();
		System.out.print("dayEnd : ");				int dd2 =sc.nextInt();
		System.out.print("monthEnd : ");			int mm2 =sc.nextInt();
		System.out.print("Thai YearEnd : ");		int yy2 =sc.nextInt();
		int sum = sumForward(dd, mm, yy, dd2, mm2, yy2);
		System.out.println("     number of Day : "+sum);
	}
	public static int sumForward(int dd,int mm,int yy,int dd2,int mm2,int yy2)
	{	
		int [] dayMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int sum = 0; 
		yy = yy-543; 
		yy2 = yy2-543;
		if(leapYear(yy))
			dayMonth[2] = 29;
		while (dd != dd2 || mm != mm2 || yy != yy2)
		{sum++; dd++;
			if(dd > dayMonth[mm])
			{	dd = 1; 
				mm++;
				if(mm == 13)
				{	mm = 1;
					yy++;
					dayMonth[2] = 28;
					if(leapYear(yy))
						dayMonth[2] = 29;
				}
			}
		}
		return sum;
	}
	public static boolean leapYear(int year)
	{ if(year%4 == 0 && (year%100 !=0 || year%400 == 0))
		return true;
	else return false;
	}
		
}
