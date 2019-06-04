import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Get the year from the user
		int year = in.nextInt();
		
		// year is divisible by 4
        // year is divisible by 100, then it is divisible by 400
		if(((year % 4 == 0) && (year % 100 != 0)) || 
		   ((year % 100 == 0) && (year % 400 == 0)))
		{
		    System.out.print("Leap year");
		}
		else
		{
		    System.out.print("Non Leap year"); 
		}
    }
}