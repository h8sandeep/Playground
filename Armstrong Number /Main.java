import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in =new Scanner(System.in);
      int n= in.nextInt();
   int c=0;
      int temp=n;
 while(n>0)
 {int a=n%10; n=n/10; c=c+(a*a*a);}
  if(temp==c)
    System.out.println("Armstrong Number");
                       else
                       {
                       System.out.println("Not a Armstrong Number");}
	}
  
}