import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
  		// To print *,# alternatively in a right angled triangle
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int row ;
      int clm;
      int count = 0;
      for(row= 1;row<=num;row++)
      { 
        for(clm=1;clm<=row;clm++)
        { count = count +1;
         if(count%2==1)
            System.out.print("*");
         else 
            System.out.print("#");
          }
        System.out.println(" ");
      }
    }
}