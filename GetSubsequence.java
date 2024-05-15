import java.util.*;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = gss(str); // gss-get substring, result
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0); // a
        String ros = str.substring(1);// bc
        ArrayList<String> rres = gss(ros); // [--,-c,b-,bc]

        ArrayList<String> myres = new ArrayList<>();
        for (String rstr : rres) {		//recursion string, recursion result
            myres.add("" + rstr);
        }
        for (String rstr : rres) {
            myres.add(ch + rstr);
        }
        return myres;
    }
}

// import java.io.*;
// import java.util.*;

// public class GetSubsequence {
// public static ArrayList<String> subseq(String str) {
// if (str.length() == 0) {
// ArrayList<String> base = new ArrayList<>();
// base.add("");
// return base;
// }
// char ch = str.charAt(0);
// ArrayList<String> recAns = subseq(str.substring(1));

// ArrayList<String> myAns = new ArrayList<>();
// for (String s : recAns) {
// myAns.add(s);
// myAns.add(ch + s);
// }
// return myAns;
// }

// public static void main(String[] args) {
// System.out.println(subseq("abcd"));
// }
// }    