import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //to print stars vertically
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int count=1;count<=num;count++)
    {System.out.println("*");}
  }
}