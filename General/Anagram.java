import java.util.*;
import java.io.*;
import java.lang.*;
class Anagram{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String y=sc.nextLine();
        if(x.length()==y.length()){       
        char[] arr1=(x.toLowerCase()).toCharArray();
        char[] arr2=(y.toLowerCase()).toCharArray();
        int[] val=new int[26];
        for(int i=0;i<arr1.length;i++){
            val[arr1[i]-'a']++;
            val[arr2[i]-'a']--;
        }
        boolean flag=true;
        for(int i=0;i<26;i++){
          if(val[i]!=0){
              flag=false;
              break;
          }
         
        }
        if(flag){
            System.out.println("Anagram");

        }else{
            System.out.println("Not Anagram");
        }
       
        }
        else{
            System.out.println("Not Anagram");
        }

        }
}