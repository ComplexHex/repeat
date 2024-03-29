package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");

//        String s1 = "ABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc.");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("ch$");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D");

        String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern1 = Pattern.compile("\\w+"); //[A-Za-z0-9]
        Pattern pattern2 = Pattern.compile("\\W"); //[space]
        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()){
            System.out.println(matcher.start() + " " +matcher.group());
        }
    }
}
