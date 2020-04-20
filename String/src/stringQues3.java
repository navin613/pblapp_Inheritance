import java.util.*;

public class stringQues3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        String a = s.substring(0,2);
        for(int i=0;i<len;i++){
            System.out.print(a);
        }
    }
    
}
