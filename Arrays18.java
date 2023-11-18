// l9 q5
public class Arrays18 {
    public static void Triplets(int nums[]){
        System.out.print("[ ");
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        System.out.print("["+nums[i]+","+nums[j]+","+nums[k]+"] ");
                    }
                }
            }
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        Triplets(nums);
    }
}