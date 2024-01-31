package Avi_Training;
import java.util.*;
public class D3_Asgn_5
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of array");
        for(int i= 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the first index");
        int l = sc.nextInt() ;
        System.out.println("enter the last index");
        int r = sc.nextInt();
        int count =0 ,ans=0  , i=0;
        while(l<=r)
        {
            i = l%n;
            ans += arr[i];
            l++;
        }
        System.out.println("output" + ans);
    }

}
