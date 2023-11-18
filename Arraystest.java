import java.util.*;

public class Arraystest{

    public static void printsubarray(int numbers[]) {
    int total_sub_arrays=0; 
    int sum=0;
    int temp;
    int sums[] = new int[numbers.length];

        for(int i=0; i<numbers.length; i++) { //Loop 1: start index each iteration

            for(int j=i; j<numbers.length; j++) { //Loop 2: end index each iteration
                
                for(int k=i; k<=j; k++) { //Loop 3: print the subarray
                    System.out.print(numbers[k]+" ");
                                                  
                    sum+=numbers[k];           
                                                 
                }
                sums[j]=sum; //Storing the sum of each j iteration in this array named 'sums'.
                
                System.out.print("-------"+"Sum = "+ sum); //Sum of each sub array.
                sum = 0; //We have to reset the sum to 0 again otherwise in the next iteration it will also add the previous sum's value.

                total_sub_arrays++;
                System.out.println();

            }

            int smallest=Integer.MAX_VALUE;
            int largest=Integer.MIN_VALUE;
             
            for(int m=i; m<sums.length; m++) { 
                if(sums[m]<smallest) {         
                    smallest = sums[m];
                }
                if(sums[m]>largest) {
                    largest = sums[m];
                }
            }
            System.out.println("\nMinimum Sum = "+ smallest + "|| Maximum Sum = "+ largest);

            System.out.println("\n\n");

        }
        System.out.println("The total amount of sub arrays = "+ total_sub_arrays);

    }

    public static void main(String args[]) {
        int numbers[]={2,4,8,6,10,1,5,9};
        printsubarray(numbers);
    }
}
