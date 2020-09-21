import java.lang.*;
import java.io.*;
import java.util.*;
class Factorial{
    public static int rec_fact(int n){
        if(n==0) return 1;
        else{return rec_fact(n-1)*n;}

    }
    public static int iter_fact(int n){
        int val=1;
        for(int i=1;i<=n;i++){
            val*=i;
        }
        return val;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Factorial Program");
        int x=sc.nextInt();
        System.out.println("Factorial using recursion");
        System.out.println(rec_fact(x));
        System.out.println("Factorial using iteration");
        System.out.println(iter_fact(x));
    }
}