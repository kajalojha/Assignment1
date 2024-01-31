package Avi_Training;

public class D3_Asgn_11
{

        void conquer(int arr[],int s, int e , int mid)
        {
            int ans[]=new int[e-s+1];
            int inx1=s;
            int inx2=mid+1;
            int k=0;
            while(inx1 <=mid && inx2<=e)
            {
                if(arr[inx1]<=arr[inx2])
                {
                    ans[k++]= arr[inx1++];
                }
                else
                {
                    ans[k++]= arr[inx2++];
                }
            }
            while(inx1<=mid)
            {
                ans[k++]=arr[inx1++];

            }
            while(inx2<=e)
            {
                ans[k++]= arr[inx2++];
            }
            for(int i=0,j=s;i<ans.length;i++,j++)
            {
                arr[j]= ans[i];
            }
        }
        public void divide(int arr[],int s,int e)
        {
            if(s>=e)
            {
                return;
            }
            int mid = s+(e-s)/2;
            divide(arr,s,mid);
            divide(arr,mid+1,e);
            conquer(arr,s,e,mid);
        }
        public static void main(String[] args)
        {
            int arr[]= {4,77,2,1,0};
            int s = 0;
            int e=arr.length-1;
            D3_Asgn_11 obj = new D3_Asgn_11();
            obj.divide(arr,s,e);
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i] + " ");
            }
        }

    }
