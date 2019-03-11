import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int row = 1;row<=num;row++)
      {
        for(int clm = 1;clm<=num;clm++)
         { System.out.print(row);
          }
        System.out.println(" ");
      }
      
       }
	}
