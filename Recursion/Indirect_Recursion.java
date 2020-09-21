import java.lang.*;
import java.util.*;
class Indirect_Recursion{
    public static void fun_A(int x){
        if(x>1){
            System.out.printf("%d ",x);
            fun_B(x/2);
        }

    }

    public static void fun_B(int x){
        if(x>0){
            System.out.printf("%d ",x);
            fun_A(x-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("InDirect_Recursion");
        int x=sc.nextInt();
        fun_B(x);
    }
}