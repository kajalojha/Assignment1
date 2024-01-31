package Avi_Training;
import java.util.Scanner;
public class D3_Asgn_4
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        long pro = 1;

        System.out.println("enter the element of array");
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
            pro = pro*arr[i]%1000000007;
        }

        for(int i = 0 ; i<arr.length;i++)
        {

            System.out.println(pro/arr[i] + " ");
        }

    }

}
