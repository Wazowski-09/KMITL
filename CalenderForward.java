import java.util.*;
class CalenderForward
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String [] month = {" ","Jan","Feb","March","Arp","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		System.out.print("Day "); int dd1 = in.nextInt();
		System.out.print("Month "); int mm1 = in.nextInt();
		System.out.print("Inter Year "); int yy1 = in.nextInt();
		System.out.print("Number of Day "); int noOfday = in.nextInt();
		int [] dayAns = DayForward( dd1 ,  mm1,  yy1,  noOfday);
		System.out.println(dayAns[1]+" "+month[dayAns[2]]+ " "+dayAns[3]);

	}
		
		public static int[] DayForward(int dd1, int mm1 , int yy1 , int noOfday){
		int [] dayMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int ans[] = new int[4];
		int sum = 0;
		yy1 = yy1 - 543;
		if(leapyear(yy1)) dayMonth[2] = 29;
		while(sum < noOfday){
		 sum++; dd1++;
		 if(dd1>dayMonth[mm1]){
		   dd1++; mm1++;
		   
		 if(mm1 == 13){
		  mm1 = 1; yy1++;
		  dayMonth[2] = 28;
		 if(leapyear(yy1)) dayMonth[2] = 29;
		 }
		}
		}
	   yy1 = yy1 + 543;
	   ans[1] = dd1; ans[2] = mm1; ans[3] = yy1;
	   return ans;
	   }
	 public static boolean leapyear(int yy1){
	 if(yy1%4 ==0 &&(yy1%100 !=0 || yy1%400 ==0)) return true;
	 else return false;
		}
		}
		