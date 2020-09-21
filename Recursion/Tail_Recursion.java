import java.util.*;
import java.lang.*;
class Tail_Recursion{
    public static void tail_recursion(int n){
        if(n>0){
            System.out.println(n);
            tail_recursion(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Tail_Recursion");
        int x=sc.nextInt();
        tail_recursion(x);
    }
}