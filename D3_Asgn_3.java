package Avi_Training;

public class D3_Asgn_3
{
    public static int[] findMissingRepeatingNum(int[] a) {
        int n = a.length;//size of array
        int repeating = -1;
        int missing = -1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] == i)
                {
                    count++;
                }
            }
            if (count == 2)
            {
                repeating = i;
            }
            else if (count == 0)
            {
                missing = i;
            }
            if (repeating != -1 && missing != -1) {
                break;
            }
        }
                int[] ans = {repeating, missing};

        return ans;
    }
    public static void main(String[] args){
        int[] a = {8,1,3,4,5,7,6};
        int[] ans = findMissingRepeatingNum(a);
        System.out.print("the missing and repeating num" + ans[0] + ans[1]);



    }
}
