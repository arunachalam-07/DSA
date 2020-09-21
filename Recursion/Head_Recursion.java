import java.io.*;
import java.lang.*;
import java.util.*;
class Head_Recursion{
    public static void head_recursion(int n){
        if(n>0){
            head_recursion(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Head Recursion");
        int x=sc.nextInt();
        head_recursion(x);
    }
}