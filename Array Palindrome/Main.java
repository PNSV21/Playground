import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // code to check if given array is palindrome or not
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int left = 0;
      int right = arr_size-1;
      int is_palindrome = 1;
      for(int i = 0; i < arr_size ; i++ )
      {arr[i]=in.nextInt();
      }
      for(int j = 0; j < arr_size;j++)
      {if(arr[j]!=arr[(arr_size-1)-j])
      {is_palindrome = 0;
       break;
      }
      }
      if(is_palindrome==1)
      {System.out.print("Yes");}
      else if(is_palindrome==0)
      {System.out.print("No");}
    }
}