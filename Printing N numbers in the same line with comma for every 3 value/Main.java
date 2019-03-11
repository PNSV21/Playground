import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //to print n numbers with comma after every 3 digits
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int count = 1;count<=num;count++)
    {if(count%3==0)
      System.out.print(count +",");
     else
       System.out.print(count);
    
    }
  }
}