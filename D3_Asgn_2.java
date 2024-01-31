package Avi_Training;

public class D3_Asgn_2
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,4};
        if(arr.length == 0 ){
            System.out.print("array is empty");
            return;
        }
        int uniqIndex = 0;//to keep track of unique elements
        for(int i = 1; i<arr.length ;i++)
        {
            if (arr[i] != arr[uniqIndex])//compare current element with previous
            {
             uniqIndex++;
              arr[uniqIndex] = arr[i];
            }
        }
        int newlength = uniqIndex+1;
        System.out.print(" the new array ");
        for(int i=0 ;i<newlength;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println(" the length of new array " + newlength);

    }
}
