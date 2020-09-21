import java.util.*;
import java.io.*;
import java.lang.*;
class Tree_Recursion{
    public static void tree_recursion(int x){
        if(x>0){
        System.out.printf("%d ",x);
        tree_recursion(x-1);
        tree_recursion(x-1);
        }
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Tree Recursion");
        int x=Sc.nextInt();
        tree_recursion(x);
        
    }
}