package Avi_Training;
import java.util.*;
public class D3_Asgn_9
{public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the element of arr");
    for(int i =0 ;i<arr.length ;i++)
    {
        arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int i = 1 , max = 0;
    int last = 0 ;
    int count = 1;
    while(i<=n-1){
        if(arr[i] == arr[i-1] + 1)
        {
            count++;
        }
        else{
            count= 1;
        }
        if(count>=max){
             max = count;
             last = i;
        }
        i++;
    }
    System.out.println("longest subsequence is ");
    for(int j = last-max+1 ;j<= last ;j++){
        System.out.print(arr[j] + " ");
    }
}
}
