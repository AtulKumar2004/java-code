// printing subarrays
public class Arrays10 {
    public static void subarrays(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            System.out.print("{"+numbers[i]+"} ");
            ts++;
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("{");
                for(int k=i;k<=j;k++){
                    System.out.print(k==j?numbers[k]+"}":numbers[k]+",");
                }
                ts++;
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("total subarrays = "+ts);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subarrays(numbers);
    }
}