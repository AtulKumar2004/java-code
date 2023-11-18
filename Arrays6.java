// find largest and smallest from array
public class Arrays6 {
    public static int getlargestandsmallest(int numbers[]){
        int largest=Integer.MIN_VALUE; //-infinity
        int smallest=Integer.MAX_VALUE; // +infinity
        for(int i=0;i<numbers.length;i++){ // time complexity of function is O(n) 
            // find largest
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            //find smallest
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest is : "+smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        System.out.println("largest is : "+getlargestandsmallest(numbers));
    }
}