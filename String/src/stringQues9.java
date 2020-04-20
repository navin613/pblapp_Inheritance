import java.util.*;

public class stringQues9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int n1 = a.length();
        int n2 = b.length();
        int i=0,j=0;
        while(i<n1 && j<n2){
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(j);
            System.out.print(ch1);
            System.out.print(ch2);
            i++;
            j++;
        }
        
        while(i<n1){
            char ch = a.charAt(i);
            System.out.print(ch);
            i++;
        }
        
        while(j<n2){
            char ch = b.charAt(j);
            System.out.print(ch);
            j++;
        }
    }
}
