// linear search on String array
public class Arrays5hw {
    public static int linearSearch(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[]={"Dosa","Samosa","Ice cream","chole bhature","rajma chawal","veg biryani","rasmallai"};
        String key="cholure";
        int index=linearSearch(menu,key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("key is at index = "+index);
        }
    }
}
