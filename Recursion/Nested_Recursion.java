import java.lang.*;
import java.util.*;
class Nested_Recursion{
    public static int nested_recursion(int x){
        if(x>100){
            return x-10;
        }
        else{
            return nested_recursion(nested_recursion(x+11));
        }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nested Recursion");
        int x=sc.nextInt();
        System.out.println(nested_recursion(x));
    }
}