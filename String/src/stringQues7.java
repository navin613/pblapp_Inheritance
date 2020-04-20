import java.util.*;

public class stringQues7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        StringBuffer sb1 = new StringBuffer();
        sb1.append(s);
        if(sb1.charAt(0)=='x' && sb1.charAt(len-1)=='x'){
            System.out.print(sb1.substring(1, len-1));
        }
        else{
            System.out.print(sb1);
        }
    }
}
