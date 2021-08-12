//package homework1_2;

import java.io.*;

public class circularLetter {
    public static void main(String[] args) throws IOException {
        Scanner file1 = new Scanner(new FileReader("/Users/mikebook/Documents/All-Flie/code-kmitl/oop/homework1_2/friend.dat"));
        PrintWriter fileOut = new PrintWriter("/Users/mikebook/Documents/All-Flie/code-kmitl/oop/homework1_2/letter.dat");
        String line;
        while (file1.hasNext()) {
            String name = file1.next();
            String tel = file1.next();
            String address = file1.next() + " " + file1.next() + " " + file1.next();
            String zip = file1.next();
            Scanner file2 = new Scanner(
                    new FileReader("/Users/mikebook/Documents/All-Flie/code-kmitl/oop/homework1_2/letter.dat"));
            while (file2.hasNext()) {
                line = file2.nextLine();
                line = line.replace("%", name);
                line = line.replace("$", address);
                line = line.replace("#", zip);
                fileOut.print(line);
                System.out.println(line);

            }
        }
        fileOut.close();
    }
}