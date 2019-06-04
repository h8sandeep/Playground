import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int x= 0,y= 1;
        while(x < exponent)
        {
            y = y * base;
            x++;
        }
        System.out.println(y);
    }
}