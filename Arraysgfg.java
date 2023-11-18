import java.util.Arrays;

public class Arraysgfg
{
    public static int findMinDiff (int a[], int n, int m)
    {
        Arrays.sort(a);
        int i,min=Integer.MAX_VALUE;
        int diff[]=new int[n-m+1];
        for(i=0;i<n-m+1;i++)
        {
            diff[i]=a[i+m-1]-a[i];
        }
        for(i=0;i<n-m+1;i++)
        {
            if(min>diff[i])
            {
                min=diff[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int a[]={3, 4, 1, 9, 56, 7, 9, 12};
        int n=a.length;
        int m=5;
        int min=findMinDiff (a,n,m);
        System.out.println(min);
    }
}
    

