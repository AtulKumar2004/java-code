// l10 question
public class Arrays21 {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swaps=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swaps++;
                }
            }
            if(swaps<1){
                break;
            }
        }
    }
    public static void selectionSort(int arr[]){
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            int largest=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(largest<arr[j]){
                    largest=arr[j];
                    c=j;
                }
            }
            // swap
            arr[c]=arr[i];
            arr[i]=largest;
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            // finding out the correct position to insert
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // inserting
            arr[prev+1]=curr;
        }
    }
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(arr[i],largest);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }

    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        printArray(arr);

    }
}