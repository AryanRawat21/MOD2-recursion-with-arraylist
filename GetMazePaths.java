
// import java.util.*;

// public class GetMazePaths {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int m = scn.nextInt();
//         ArrayList<String> paths = getMazePath(1,1,n,m);
//         System.out.println(paths);
//     }

//     public static ArrayList<String> getMazePath(int sr, int sc, int er, int ec) {
//         if (sr == er && sc == ec) {
//             ArrayList<String> base = new ArrayList<>();
//             base.add("");
//             return base;
//         }
//         ArrayList<String> myAns = new ArrayList<>();
//         if (sc + 1 <= ec) {
//             ArrayList<String> horizontal = getMazePath(sr, sc + 1, er, ec);
//             for (String s : horizontal)
//                 myAns.add("H" + s);
//         }
//         if (sr + 1 <= er) {
//             ArrayList<String> vertical = getMazePath(sr + 1, sc, er, ec);
//             for (String s : vertical)
//                 myAns.add("V" + s);
//         }
//         return myAns;
//     }
// }

//Summeet malik way

import java.util.*;

public class GetMazePaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMaze(1, 1, n, m);
        System.out.println(paths);
    }

    public static ArrayList<String> getMaze(int sr, int sc, int er, int ec) {
        if (sr == er && sc == ec) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if (sc < ec)
            hpaths = getMaze(sr, sc + 1, er, ec);

        if (sr < er)
            vpaths = getMaze(sr + 1, sc, er, ec);

        ArrayList<String> paths = new ArrayList<>();
        for (String hpath : hpaths) {
            paths.add("h" + hpath);
        }

        for (String vpath : vpaths) {
            paths.add("v" + vpath);
        }
        return paths;
    }

}

//WHEN DIAGONAL IS INCLUDED IN THIS QUESTION!!!!
// import java.io.*;
// import java.util.*;

// public class GetMazePath {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int sr = scn.nextInt();
//         int sc = scn.nextInt();
//         int er = scn.nextInt();
//         int ec = scn.nextInt();
//         ArrayList<String> paths = getMazePath(sr, sc, er, ec);
//         System.out.println(paths);
//     }

//     public static ArrayList<String> getMazePath(int sr, int sc, int er, int ec) {
//         if (sr == er && sc == ec) {
//             ArrayList<String> base = new ArrayList<>();
//             base.add("");
//             return base;
//         }
//         ArrayList<String> myAns = new ArrayList<>();
//         if (sc + 1 <= ec) {
//             ArrayList<String> horizontal = getMazePath(sr, sc + 1, er, ec);
//             for (String s : horizontal)
//                 myAns.add("H" + s);
//         }
//         if (sr + 1 <= er && sc + 1 <= ec) {
//             ArrayList<String> diagonal = getMazePath(sr + 1, sc + 1, er, ec);
//             for (String s : diagonal)
//                 myAns.add("D" + s);
//         }
//         if (sr + 1 <= er) {
//             ArrayList<String> vertical = getMazePath(sr + 1, sc, er, ec);
//             for (String s : vertical)
//                 myAns.add("V" + s);
//         }
//         return myAns;
//     }
// }