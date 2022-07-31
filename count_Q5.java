/*Given 2 strings, a and b, return the number of the
 positions where they contain the same length 2 substring.
 So "xxcaazz" and "xxbaaz" yields 3, since the
 "xx", "aa", and "az" substrings appear in the same
 place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0*/
// 21ce084
// kalp pandya
import java.util.Scanner;
public class count_Q5 {
    public static void main(String[] args) {
        String a="xxcaazz";
        String b="xxbaaz";
        int c = stringMatch(a,b);
        System.out.println(c);
    }
    public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
           // System.out.println("asub : " + aSub);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub))
                count++;
        }
        return count;
    }
}