
import java.util.*;

public class GetKPC {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> words = kpc(str);
        System.out.println(words);
    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> kpc(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0); // 6
        String ros = str.substring(1); // 78

        ArrayList<String> rres = kpc(ros); // 6 word of 78
        ArrayList<String> myres = new ArrayList<>();// 24 words of 678

        String codeforch = codes[ch - '0'];
        for (int i = 0; i < codeforch.length(); i++) {
            char chcode = codeforch.charAt(i);
            for (String rstr : rres) {
                myres.add(chcode + rstr);
            }
        }
        return myres;

    }
}

// import java.io.*;
// import java.util.*;

// public class GetKPC {
// public static String[] nokiaKeys = { ".;", "abc", "def", "ghi", "jkl", "mno",
// "pqrs", "tu", "vwx", "yz" };

// public static ArrayList<String> GetKPC(String str) {
// if (str.length() == 0) {
// ArrayList<String> base = new ArrayList<>();
// base.add("");
// return base;
// }
// char ch = str.charAt(0);
// String code = nokiaKeys[ch - '0'];

// ArrayList<String> recAns = GetKPC(str.substring(1));

// ArrayList<String> myAns = new ArrayList<>();
// for (int i = 0; i < code.length(); i++) {
// for (String s : recAns) {
// myAns.add(code.charAt(i) + s);
// }
// }
// return myAns;
// }

// public static void main(String[] args) {
// for (String s : GetKPC("067")) {
// System.out.println(s);
// }
// }

// }
