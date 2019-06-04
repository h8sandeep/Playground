import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int f= (n%10)*100;
    int m=((n%100)/10)*10;
    int l=(n/100)*1;
    int s=f+m+l;
    System.out.println(s);
  }
}