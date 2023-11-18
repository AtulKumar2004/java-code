// L11 questions
public class Arrays24 {
    public static int numberofSevens(int matrix[][]){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
    public static int printsumofSecondRow(int nums[][]){
        int sum=0;
        for(int j=0;j<nums[0].length;j++){
            sum+=nums[1][j];
        }
        return sum;
    }
    public static void TransposeMatrix(int matrix[][]){
        int n=matrix.length,m=matrix[0].length;
        int transpose[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},{8,8,7},{6,5,9},{10,20,30}};
        int nums[][]={{4,7,8},{8,8,7}};
        TransposeMatrix(matrix);
    }
}