import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // 
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int temp = num;
      for(int row=1;row<=num;row++)
  {
            for(int clm=temp;clm>=1;clm--)
    { 
            System.out.print(clm+"");
     }
        temp=temp-1;
            System.out.println(" ");
   }
  
	}
}