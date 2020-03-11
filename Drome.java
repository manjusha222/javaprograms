package lmsprograms;

import java.util.Scanner;

public class Drome {
    public static void main(String args[]) {
     
       
        Scanner sc = new Scanner(System.in);
        StringBuffer s1 = new StringBuffer();
        System.out.println("Enter a String: ");
        
        System.out.println(s1);
        System.out.println("Reverse String is: "+s1.reverse());
    
        if(s1.equals(s1.reverse().toString())){
        	System.out.println("palindrome");
        }
        else{
        	System.out.println("not a palindrome");
        }
    }
}
    
