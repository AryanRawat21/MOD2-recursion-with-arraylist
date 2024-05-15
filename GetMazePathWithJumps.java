
// import java.util.*;

// public class GetMazePathWithJumps {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int m = scn.nextInt();
//         ArrayList<String> paths = getMazePath(1, 1, n, m);
//         System.out.println(paths);
//     }

//     public static ArrayList<String> getMazePath(int sr, int sc, int er, int ec) {
//         if (sr == er && sc == ec) {
//             ArrayList<String> base = new ArrayList<>();
//             base.add("");
//             return base;
//         }
//         ArrayList<String> myAns = new ArrayList<>();
//         for (int jump = 1; sc + jump <= ec; jump++) {
//             ArrayList<String> horizontal = getMazePath(sr, sc + jump, er, ec);
//             for (String s : horizontal)
//                 myAns.add("h" +jump+ s);
//         }
//         for (int jump = 1; sr + jump <= er; jump++) {
//             ArrayList<String> vertical = getMazePath(sr + jump, sc, er, ec);
//             for (String s : vertical)
//                 myAns.add("v" +jump+ s);
//         }
//         for (int jump = 1; sc + jump <= ec && sr + jump <= er; jump++) {
//             ArrayList<String> diagonal = getMazePath(sr + jump, sc + jump, er, ec);
//             for (String s : diagonal)
//                 myAns.add("d" +jump+ s);
//         }
//         return myAns;
//     }
// }


import java.io.*;
import java.util.*;

public class GetMazePathWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> paths = new ArrayList<>();
        
        //horizontal path
        for(int ms = 1; ms <= dc - sc; ms++){       //move size
            ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);
            for(String hpath : hpaths){
                paths.add("h" + ms + hpath);
            }
        }
        
        //vertical path
        for(int ms = 1; ms <= dr - sr; ms++){       //move size
            ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);
            for(String vpath : vpaths){
                paths.add("v" + ms + vpath);
            }
        }
        
        //diagonal path
        for(int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++){       //move size
            ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);
            for(String dpath : dpaths){
                paths.add("d" + ms + dpath);
            }
        }
        
        return paths;
    }

}