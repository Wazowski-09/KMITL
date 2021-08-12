// Java code to demonstrate the working of
// get() method in ArrayList

// for ArrayList functions
import java.util.ArrayList;

public class testfinal {
	public static void main(String[] args)
	{

		// creating an Empty Integer ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>(4);

		// using add() to initialize values
		// [10, 20, 30, 40]
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
        int j =1;
		System.out.println("List: " + arr);
		// element at index 2
		// int element = arr.get(j+1);
        // element = arr.get(j);
        arr.get(j+1) = arr.get(j);
		System.out.println("the element at index 2 is " + element);
	}
}
