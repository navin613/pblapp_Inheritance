import java.util.*;

class stringQues13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        StringBuffer sb = new StringBuffer();
        while (s1.indexOf(s2) != -1) {
            int index = s1.indexOf(s2);
            if (index == 0 && index + s2.length() < s1.length() - 1) {
                sb.append(s1.charAt(index + s2.length()));
                s1 = s1.replaceFirst(s2, "");
                continue;
            }
            
            if (index - 1 >= 0 && index + s2.length() >= s1.length()) {
                sb.append(s1.charAt(index - 1));
                s1 = s1.replaceFirst(s2, "");
                continue;
            }

            if (index + s2.length() < s1.length() - 1 && index - 1 >= 0) {
                sb.append(s1.charAt(index - 1));
                sb.append(s1.charAt(index + s2.length()));
                s1 = s1.replaceFirst(s2, "");
            }
        }
        System.out.println(sb);
    }
}