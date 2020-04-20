import java.util.*;

public class stringQues5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String a = s.substring(1);
        int len = a.length();
        String res = a.substring(0,len-1);
        System.out.println(res);
    }
}
