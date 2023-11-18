// Binary Search
public class Arrays7 {
    public static int binarySearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12};
        int key=12;
        int index=binarySearch(numbers,key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("key is found at: "+index);
        }
    }
}