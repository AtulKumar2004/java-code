// 2d arrays and some algorithms
public class Arrays23 {
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            // top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            // right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        int n=matrix.length;
        // for(int i=0;i<n;i++){  // O(n^2)
        //     for(int j=0;j<matrix[0].length;j++){
        //         if((i==j) || (i+j) == n-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // return sum;
        for(int i=0;i<n;i++){   // O(n)
            //pd
            sum += matrix[i][i];
            //sd
            if(i!=n-1-i){
                sum+=matrix[i][n-1-i];
            }
        }
        return sum;
    }
    public static void searchinSortedMatrix(int matrix[][],int key){ // staircase search O(n+m)
        // taking starting point as (0,m-1)
        // int row=0,col=matrix[0].length-1;
        // while(row<matrix.length && col>=0){
        //     if(matrix[row][col] == key){
        //         System.out.println("Key found at ("+row+","+col+")");
        //         return;
        //     }
        //     else if(matrix[row][col]>key){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        // System.out.println("Key not found!");
        
        // another approach taking starting point as(n-1,0)
        int row=matrix.length-1,col=0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col] == key){
                System.out.println("Key found at ("+row+","+col+")");
                return;
            }
            else if(matrix[row][col]>key){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found!");
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        searchinSortedMatrix(matrix,20);
    }
}