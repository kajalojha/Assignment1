package Avi_Training;

public class D3_Asgn_12
{
    public static void main(String[] args)
    {
      int a[] = {5,1,6,2,3};
      int temp , j , i;
      for( i =1 ;i<a.length ;i++)
      {
          temp = a[i];
          j=i;
          while(j>0 && a[j-1] >temp)
          {
              a[j] = a[j-1];
              j= j-1;
          }
          a[j] = temp;
      }
      //System.out.println();
      for( i = 0 ;i<a.length ; i++ )
      {
          System.out.println(a[i]);
      }

    }
}
