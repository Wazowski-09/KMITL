import java.io.*;
import java.util.*;

class enCoding {
    public static void main(String[] args) throws IOException{
        Scanner fileIn = new Scanner(new FileReader("/Users/mikebook/Documents/All-Flie/code-kmitl/oop/homework1/text1.txt"));
        PrintWriter fileOut = new PrintWriter("/Users/mikebook/Documents/All-Flie/code-kmitl/oop/homework1/text2.txt");
        String line;
        while(fileIn.hasNext()){
            line = fileIn.nextLine();
            fileOut.println(endecode.enCode(line));
            System.out.println(endecode.deCode(line));
        }
        fileOut.close();
    }
}
