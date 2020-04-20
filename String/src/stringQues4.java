import java.util.*;

public class stringQues4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        if(len%2==0){
            System.out.println(s.substring(0, len/2));
        }
        else{
            System.out.println("Null");
        }
    }
}
