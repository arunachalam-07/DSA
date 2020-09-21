import java.util.*;
import java.io.*;
import java.lang.*;
class Palindrome{
    public static void main(String args[]) {
        char[] arr1=(args[0].replace("//s","")).toCharArray();
        char[] arr2=new char[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr2[arr1.length-i-1]=arr1[i];
        }
        System.out.println(String.valueOf(arr1).equals(String.valueOf(arr2)));
        
    }
}