import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int num =in.nextInt();
      switch(num)
      {
        case 1 :
          System.out.println("one");
          break;
      
       case 2 :
          System.out.println("two");
       break;
      
        case 3 :
          System.out.println("Three");
         break;
        case 4 :
          System.out.println("four");
         break;
      
       
        case 5 :
          System.out.println("five");
         break;
      }
      if(num>5)
        System.out.println("Invalid");
      }
	}
