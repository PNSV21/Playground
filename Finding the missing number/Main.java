import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // code to print missing no in array of consecutive no's
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int idl[] = new int[arr_size];
      for(int i = 0;i < arr_size ; i++)
      {arr[i] = in.nextInt();
      }
      for(int j = 0;j<arr_size ; j++)
      {idl[j]= j+1;
      }
      for(int i =0;i<arr_size;i++)
      {for(int j =0;j<arr_size;j++)
      {if(arr[i]==idl[j])
      {idl[j]=0;}
      }
    }
      for(int j = 0;j<arr_size;j++)
      {if(idl[j]>0)
      {System.out.print(idl[j]);
      }
}
}
}
