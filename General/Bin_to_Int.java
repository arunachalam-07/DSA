import java.lang.*;
import java.io.*;
import java.util.*;
class Bin_to_Int{
    public static void direct_method(String x){
        System.out.println(Integer.parseInt(x,2));
    }
    public static void custom_method(int x){
        int dec=0;
        int n=0;
        while(true){
            if(x==0){
                break;
            }
            else{
                int temp=x%10;
                dec+=temp*Math.pow(2,n);
                x/=10;
                n++;

            }
        }
        System.out.println(dec);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        System.out.println("direct_method");
        direct_method(x);
        System.out.println("custom_method");
        custom_method(Integer.valueOf(x));

    }
}