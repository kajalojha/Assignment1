package Avi_Training;
import java.util.*;
//You are given a sorted array 'arr' of distinct values and a target value 'm'.
//You need to search for the index of the target value in the array.
//        Note:If the value is present in the array, return its index.
//If the value is absent, determine the index where it would be inserted in the array while maintaining the sorted order.
//Example:
//Input:  arr = [1, 2, 4, 7],  m = 6
//Output: 3
public class D3_Asgn_13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element");
        for(int i =0 ; i<arr.length ;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element");
        int m = sc.nextInt();

        for(int i= 0 ;i<arr.length ;i++)
        {
            if(m>arr[i])
            {
                continue;
            }
            else if(m<arr[i])
            {
               System.out.println("array need to be inserted here :" + i);
               break;
            }
            else if(m==arr[i])
            {
                System.out.println("element is already present : ");
            }
            else{
                System.out.println("index is not present"+ arr.length);
            }
        }
    }

}
