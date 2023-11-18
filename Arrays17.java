// l9 q2
public class Arrays17 {
    public static int Search(int nums[],int target){
        int n=nums.length;
        int minindex=minimum(nums);
        int start=0,end=minindex-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        start=minindex;end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    
    public static int minimum(int nums[]){
        int minimumval=Integer.MAX_VALUE;
        int minindex=0;
        for(int i=0;i<nums.length;i++){
            if(minimumval>nums[i]){
                minimumval=nums[i];
                minindex=i;
            }
        }
        return minindex;
    }  
    public static void main(String args[]){
        int nums[]={0,1,2,4,5,6,7};
        int k=3;
        int target=0;
        int n=nums.length;
        int arr[]=new int[n];
        int j=0;
        int l=0;
        for(int i=k;i<n;i++){
            arr[j]=nums[i];
            j++;
        }
        for(int i=j;i<n;i++){
            arr[i]=nums[l];
            l++;
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        System.out.println(Search(nums,target));
    }
}       