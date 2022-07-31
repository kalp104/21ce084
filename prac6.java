// 21CE084
//kalp pandya
/*Given an array of strings, return a new array
without the strings that are equal to the target
string. One approach is to count the occurrences
of the target string, make a new array of the correct
length, and then copy over the correct strings.
wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]*/

public class prac6 {
    public String[] wordsWithouttarget(String[] words, String target) {
        int found = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target))
                found++;
        }
        found = words.length - found;
        int place = 0;

        String[] str = new String[found];
        for (int j = 0; j < words.length; j++) {
            if (!words[j].equals(target)) {
                str[place] = words[j];
                place++;
            }
        }
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        prac6 p6=new prac6();
        String[] s={"a","b","c","d"};
        p6.wordsWithouttarget(s, "a");
        //System.out.println( p6.wordsWithout(s, "a"));
    }
}