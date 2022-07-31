/* Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only
if it is 'z', so "ozymandias" yields "oz".
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/
// 21ce084
// kalp pandya
import java.util.Scanner;
public class code1_oz{
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        char[] ch = s.toCharArray();// converting the string into array of char
        if(ch[0] == 'o')
        {
            System.out.print(ch[0]);
        }
        if(ch[1] == 'z')
        {
            System.out.print(ch[1]);

        }
        System.out.println();
    }
}

