import java.util.*;


public class stringQues10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int len = a.length();
        int n = sc.nextInt();
        String s = a.substring(len-n, len);
        for(int i=0;i<n;i++){
            System.out.print(s);
        }
    }
}
