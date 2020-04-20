import java.util.*;

public class stringQues8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String s = sc.nextLine();
        int index = s.indexOf("*");
        sb.append(s);
        if(index>0)
            sb.delete(index-1,index+2);
        
        System.out.print(sb);
    }
}
