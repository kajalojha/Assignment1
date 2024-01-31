package Avi_Training;

public class D3_Asgn_14
{
    public static void main(String[] args){
    int arr[] = {6,2,8,4,10};
    int i , j ;
    for(i=0 ; i<arr.length-1 ;i++)
    {
        for(j=0 ;j<arr.length-1 ;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp ;
            }
        }

}
        System.out.print("after sorting :");
        for( i = 0 ;i<arr.length;i++)
        {

            System.out.print(arr[i]);
        }
}
}