// input output update
import java.util.*;
public class inputoutputupdate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[100];
        System.out.println("Length of array = "+marks.length); //printing length of array marks
        // input 
        marks[0]=sc.nextInt(); // phy
        marks[1]=sc.nextInt(); // chem
        marks[2]=sc.nextInt(); // math
        // output
        System.out.println("phy = "+marks[0]);
        System.out.println("chem = "+marks[1]);
        System.out.println("math = "+marks[2]);
        //update
        marks[2]=marks[2]+1;
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage = "+percentage+"%");
        //System.out.println("math = "+marks[2]);
    }
}