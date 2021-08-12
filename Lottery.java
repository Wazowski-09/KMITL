import java.util.*;
class lottery 
{	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	public static void main(String[] args){
		int[][] table = new int[25][10];
		int[][] Ans = new int[25][10];
		Ans = getData(table);
		printData(table);
        int max2 = findData(table);
        blenum(max2);
		//System.out.println("Ans = "+ans);
		
	}
	
	public static int[][] getData(int[][]table){
		for (int i = 1; i<25; i++)
		{
			for (int j = 1; j<10; j++)
			{
				double rnd = Math.random();
				int A = (int)(rnd * 100);
				table[i][j] = A; 
			}
		}
		return table;
	}

	public static void printData(int[][]table){
		for (int i = 1; i<25; i++)
		{ 
			for (int j = 1; j<10; j++)
			{
				System.out.print(table[i][j]+"\t");
			}
		System.out.println();
		}
	}

	public static int findData(int[][] table){
        int max = 0;
        int mode = 0;
        int max1 = 0;
		int[]Count = new int[101];
		for (int i = 1; i<25; i++)
		{
			for (int j = 1; j<10; j++)
			{
				if (table[i][j] > max)
				{
					Count[table[i][j]]++;
				}
			}
        }

		for (int k = 1; k<Count.length; k++)
		{   
			if (Count[k] > mode)
			{
                mode = Count[k];
                max1 = k;
			}
		}
        System.out.println("Freq = "+mode);
        System.out.println("Mode = "+max1);
        return max1;

    }
    public static void blenum(int max){
        if (max%10 == max/10){
            System.out.println("blenum");

        }
        else System.out.println("not blenum");
    }
}
