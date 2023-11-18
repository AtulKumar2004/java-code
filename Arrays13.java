// printing maximum and minimum subarray sum(prefix sum approach)
public class Arrays13 {
    public static void maxandminSubarraySum(int numbers[]) {
        int prefix[]=new int[numbers.length];
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int currsum=0;
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currsum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                if(minsum>currsum){
                    minsum=currsum;
                }
            }
        }
            System.out.println("maximum sum = "+maxsum);
            System.out.println("minimum sum = "+minsum);
    }
    public static void kadanes(int numbers[]){ // kadanes algorithm is used to calculate maximum subarray sum from integers array
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
                c=1;
                break;
            }
        }
        if(c==1){
            for(int i=0;i<numbers.length;i++){
                cs=cs+numbers[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(cs,ms);
            }
        }
        else{
            for(int i=0;i<numbers.length;i++){
                if(ms<numbers[i]){
                    ms=numbers[i];
                }
            }
        }
        System.out.println("maximum sum = "+ms);
    }
    public static void main(String[] args) {
        int numbers[]={-2,3,-4,1,5,-7};
        maxandminSubarraySum(numbers);
        // kadanes(numbers);
    }
}