package Avi_Training;
import java.util.Arrays;
import java.util.Scanner;
public class D3_Asgn_7
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element");
        for(int i =0 ; i<arr.length ;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the count of max element");
        Arrays.sort(arr);
        int max = sc.nextInt();
        int ans[] = new int [max];
        int c = 0;
        int i=arr.length-1;
        while(c!=max)
        {
            if(arr[i] != arr[i-1]){
                 ans[c] = arr[i];
                 c ++;
                 i--;
            }
            else
            {
                i--;
            }
        }
        Arrays.sort(ans);
        for(i=0;i<ans.length ;i++)
        {
            System.out.println(ans[i]);
        }
    }

}
