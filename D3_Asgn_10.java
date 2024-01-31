package Avi_Training;

public class D3_Asgn_10
{
     public static void main(String[] args)
     {
          int arr[] = {3,6,2,1,9,4};
          int min , temp ;
          for(int i =0;i<arr.length ; i++)
          {
               min= i;
               for(int j = i+1 ;j<arr.length ;j++){
                    if(arr[j] < arr[min]){
                         min = j ;
                    }
                    temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp ;
               }
          }
          for(int i = 0 ;i<arr.length ;i++){
               System.out.print(arr[i] + " ");
          }

     }
}
