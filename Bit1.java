public class Bit1 {
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return (n & bitMask);
    }
    public static int updateIthBit(int n,int i,int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }

        n=clearIthBit(n,i);
        int bitMask=(newBit<<i);
        return (n | bitMask);
    }
    public static int clearIbits(int n,int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static int clearRangeOfBits(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return (n & bitMask);
    }
    public static boolean isPoweroftwo(int n){
        return (n&(n-1)) == 0;
    }
    public static int countSetBits(int n){ // O(log n +1)
        int count=0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastExpo(int a,int n){ // O(log n +1)
        int ans=1;
        while(n>0){
            if((n & 1) !=0){ // check LSB
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static int xtothePowerx(int x){
        int ans=1;
        int orig=x;
        while(x>0){
            if((x & 1)!=0){
                ans=ans*orig;
            }
            orig=orig*orig;
            x=x>>1;
        }
        return ans;
    }
    public static void swap(int a,int b){
        System.out.println("Numbers before swap: "+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Numbers after swap: "+a+" "+b);
    }
    public static int add1(int n){
        return -~n;
    }
    public static void uppercasetoSmallCase(){
        // converts upper case characters to lower case using bits
        for(char ch='A';ch<='Z';ch++){
            System.out.print((char)(ch | ' '));
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }
    public static void main(String[] args) {
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        //  System.out.println(~14);
        // System.out.println(5<<2);
        // System.out.println(6>>1);
        // oddOrEven(3);
        // oddOrEven(7);
        // oddOrEven(14);
        // System.out.println(getIthBit(10,3));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 2,1));
        // System.out.println(clearIbits(15,2 ));
        // System.out.println(clearRangeOfBits(10, 2, 4));
        // System.out.println(isPoweroftwo(16));
        // System.out.println(countSetBits(16));
        // System.out.println(fastExpo(2,4));
        // System.out.println(xtothePowerx(6));
        // swap(5, 6);
        // System.out.println(add1(10));
        // System.out.println((char)('A'|' '));
        uppercasetoSmallCase();
    }
}