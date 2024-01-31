package Avi_Training;
import java.util.*;
public class D3_Asgn_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of first array");
        int size = sc.nextInt();
        System.out.println("enter the size of first array");
        int size2 = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size2];
        int arr3[] = new int[size] ;
        int i=0;
        System.out.println("enter the element of first array");
        for( i = 0; i< arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the element of second array");
        for( i = 0; i< arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("the sum of two array is :");
        for( i=0;i<arr3.length;i++){
            arr3[i] = arr1[i] + arr2[i];
        }

        for( i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
        }


    }
}
