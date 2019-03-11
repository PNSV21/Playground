import java.util.Scanner;
class Main{
  public static int sum_of_nos(int num)
  {int son= (num *(num+1))/2;
   return son;
     }
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int son1 = sum_of_nos(num);
    System.out.println(son1);
	}
}