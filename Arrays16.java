// l9 q1
public class Arrays16 {
    public static boolean checkforatleasttwo(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={4,2,6,8,9,8};
        System.out.println(checkforatleasttwo(nums));
    }
}