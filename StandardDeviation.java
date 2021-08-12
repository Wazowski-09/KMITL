import java.util.*;

class StandardDeviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n => ");
        int n = sc.nextInt();
        double[] score = new double[n+1];
        double[] frequence = new double[100];

        for(int i =1;i<=n;i++){
            System.out.print("- Student["+i+"] => ");
            score[i]=sc.nextDouble();
        }

        double sum = 0;
        for(int i =1;i<=n;i++)
            sum = sum+score[i];
        System.out.println("\n=== RecheckPoint ===");
        for(int i =1;i<=n;i++)
            System.out.println("- Student["+i+"] => "+score[i]);
        double SD = calculateSD(score);
        int c = score.length;
        System.out.println(); 
        countFreq(score, c); 
        for (int i =1;i<score.length;i++){
            frequence[(int)score[i]]+=1;
        }
        // for (int i =1;i<frequence.length;i++){
        //    if(frequence[i]!=0.0)
        //     // System.out.println("Number => "+frequence[i]);
        //
        System.out.format("%n=== Standard Deviation === = %.6f %n", SD);
    }
    public static double calculateSD(double score[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = score.length;
        for(double num : score) {
            sum += num;
        }
        double mean = sum/length;
        System.out.printf("%n=== Mean === => %.2f %n",mean);
        for(double num: score) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation/length);
    }

    public static void countFreq(double score[], int c)
    { 
        boolean visited[] = new boolean[c];
        Arrays.fill(visited, false); 

        for (int i = 0; i < c; i++) { 
            if (visited[i] == true) 
                continue; 
            int count = 1; 
            for (int j = i + 1; j < c; j++) { 
                if (score[i] == score[j]) { 
                    visited[j] = true; 
                    count++; 
                } 
            } 
            if(score[i]!=0.0)
            System.out.println("Number Frequence => "+(int)score[i] + " = " + count); 
        }
    } 
    

}