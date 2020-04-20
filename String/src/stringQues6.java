import java.util.*;

public class stringQues6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        String s1,s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        sb1.append(s1);
        sb2.append(s2);
        int n1 = sb1.length();
        int n2 = sb2.length();
        if(n1>n2){
            sb1.append(sb2);
            sb2.append(sb1);
            System.out.println(sb2);
        }
        else{
            sb2.append(sb1);
            sb1.append(sb2);
            System.out.println(sb1);
        }
    }
    
}
