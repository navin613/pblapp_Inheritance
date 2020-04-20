import java.util.*;

public class stringQues2 {
    public static void main(String args[]){
        String a,b,c="";
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine().toLowerCase();
        b = sc.nextLine().toLowerCase();
        int len1 = a.length();
        
        if((int)a.charAt(len1-1)==(int)b.charAt(0)){
            c = b.substring(1);
        }
        else{
            c = b;
        }
        System.out.println(a.concat(c));
    }
}
