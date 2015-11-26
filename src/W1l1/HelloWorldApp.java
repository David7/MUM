package W1l1;
import java.util.*;
import java.time.LocalDate;
//import java.time.temporal.ChronoUnit;
public class HelloWorldApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		/*
		Date d = new Date();  // Current Date
		System.out.println(d);
		Date d1 = new Date(1000000000);  //  set ne w Date
		System.out.println(d1);
		//System.out.println(d.after(d1));         // true
		//System.out.println(d1.after(d));         // false
		Date d2 = (Date) d1.clone();   // Making Deep copy
		System.out.println(d2);
		System.out.println(d.compareTo(d1));      // 1
		System.out.println(d1.compareTo(d));      // -1
		System.out.println(d1.compareTo(d2));  
		System.out.println(d1.equals(d2)); // true
		System.out.println(d1.equals(d)); // false
		System.out.println(d.getTime());
	*/
		System.out.println("Today's date: " + LocalDate.now());
		System.out.println("Specified date: " + LocalDate.of(2000, 1, 1));


	}

}
