import java.util.Scanner;
class  CalendarDayForwardMonth
{
	public static void main(String[] args) 
	{
		String [] month = {" " , "jan" , "feb" , "mar" , "apr" , "may" , "june" , "july" , "aug" , "sep" , "oct" , "nov" , "dec"};
		Scanner sc = new Scanner(System.in);
		System.out.println("     DayForward");
		System.out.print("day : ");
		int dd = sc.nextInt();
		System.out.print("month : ");
		int mm = sc.nextInt();
		System.out.print("Thai Year : ");
		int yy = sc.nextInt();
		System.out.print("number of day : ");
		int noOfDay = sc.nextInt();
		int[] dayAns = dayForward(dd, mm, yy, noOfDay);
		System.out.println(dayAns[1]+" "+[dayAns[2]+" "+dayAns[3]);
	}
	public static int[] dayForward(int dd, int mm, int yy, int noOfDay)
	{
		int [] dayMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int [] ans = new int[4];
		int sum = 0;
		yy = yy-543;
		if(leapYear(yy)) 
			dayMonth[2] = 29;
		while (sum < noOfDay)
		{	sum++;
			dd++;
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
		yy += 543;
		ans[1] = dd; ans[2]= mm; ans[3] = yy;
		return ans;
	}
	public static boolean leapYear(int year)
	{ if(year%4 == 0 && (year%100 !=0 || year%400 == 0))
		return true;
	else return false;
	}
		

}
