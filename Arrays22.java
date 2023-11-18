// creation of 2D arrays
import java.util.*;
public class Arrays22 {
    public static void Search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at "+"("+i+","+j+")");
                    return;
                }
            }
        }
        System.out.println("Key not found");
    }
    public static void larandsmallest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
                if(smallest>matrix[i][j]){
                    smallest=matrix[i][j];
                }
            }
        }
        System.out.println("Smallest number in the matrix = "+smallest);
        System.out.println("Largest number in the matrix = "+largest);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        // input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        // output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // Search(matrix,5);
        larandsmallest(matrix);
    }
}
