/*Given an array of ints, return true if the sequence
 of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true*/
// 21ce084
// kalp pandya
import java.util.Scanner;

public class code_of_array {

        public static void main (String[] args)
        {
            int flag=0;
            Scanner sc = new Scanner(System.in);
            int a[] = {1,1,2,3,1};
            for(int i=0;i<(a.length-2);i++)
            {
                if(a[i]==1 && a[i+1]==2 && a[i+2]==3)
                {
                    flag=1;
                }

            }
            if(flag==1){
                System.out.println("true");
            }else if(flag==0){
                System.out.println("flase");
            }
        }
    }
