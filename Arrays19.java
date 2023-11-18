// Basic Sorting
import java.util.Arrays;
import java.util.Collections;
public class Arrays19 {
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swaps=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            if(swaps<1){
                break;
            }
        }
    }
    public static void printArray(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            // swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            // finding out the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // inserting
            arr[prev+1]=curr;
        }
    }

    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};
        // Arrays.sort(arr,0,3);
        // insertionSort(arr);
        Arrays.sort(arr,0,4,Collections.reverseOrder());
        printArray(arr);
    }
}