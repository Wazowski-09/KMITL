import java.io.*;
import java.util.Scanner;

class deCoding {
public static void main(String[] args) throws IOException{
    Scanner fileIn = new Scanner(new FileReader("/Users/mikebook/Documents/All-Flie/code-kmitl/oop/homework1/text2.txt"));
    String line;
    while(fileIn.hasNext()){
        line = fileIn.nextLine();
        System.out.println(endecode.deCode(line));
    }
}    
}
