import java.util.Scanner;
class Main {
	public static void main (String[] args){
       
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
 
		while(n >= 100)
		{
		   n = n / 10;
		}
        // Extract last digit(i.e. second digit)
		int second_digit = n % 10;
		System.out.print(second_digit);
	}
}