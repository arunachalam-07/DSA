import java.io.*;
import java.lang.*;
import java.util.*;
class Int_to_Bin{
    public static void direct_method(int n){
        System.out.println(Integer.toBinaryString(n));
    }
    public static void custom_method(int n){
        int[] binary=new int[40];
        int index=0;
        while(n>0){
            binary[index]=n%2;
            n/=2;
            index++;
        }
        while(index>=0){
            System.out.print(binary[index]);
            index--;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("using built-in method");
        direct_method(x);
        System.out.println("using custom_method");
        custom_method(x);

    }
}