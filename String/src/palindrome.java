import java.util.*;

public class palindrome {
    public static void main(String args[]){
        String a, b = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        a = sc.nextLine();
        int len = a.length();
        for(int i=len-1;i>=0;i--){
            b = b + a.charAt(i);
        }
        
        if(a.equals(b)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
}