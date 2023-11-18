// printing maximum and minimum subarray sum(brute force)
public class Arrays12 {
    public static void maxandminSubArraySum(int numbers[]){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+numbers[k];
                }
                System.out.println(sum+" ");
                if(minsum>sum){
                    minsum=sum;
                }
                if(maxsum<sum){
                    maxsum=sum;
                }
            }
        }
        System.out.println(maxsum+" is the maximum sum");
        System.out.println(minsum+" is the minimum sum");
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxandminSubArraySum(numbers);
    }
}