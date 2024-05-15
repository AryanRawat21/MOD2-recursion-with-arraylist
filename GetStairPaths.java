//SUMEET MALIK WAY
import java.io.*;
import java.util.*;

public class GetStairPaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStair(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStair(int n) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        } else if (n < 0) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        ArrayList<String> paths1 = getStair(n - 1);
        ArrayList<String> paths2 = getStair(n - 2);
        ArrayList<String> paths3 = getStair(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        for (String path : paths1) {
            paths.add(1 + path);
        }
        for (String path : paths2) {
            paths.add(2 + path);
        }
        for (String path : paths3) {
            paths.add(3 + path);
        }
        return paths;
    }
}

// // RAJNEESH WAY

// import java.io.*;
// import java.util.*;

// public class GetStairPaths {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         ArrayList<String> paths = getStairPath(n);
//         System.out.println(paths);
//     }

//     public static ArrayList<String> getStairPath(int n) {
//         if (n == 0) {
//             ArrayList<String> base = new ArrayList<>();
//             base.add("");
//             return base;
//         }
//         ArrayList<String> myAns = new ArrayList<>();
//         for (int i = 1; i <= 3 && n - i >= 0; i++) {
//             ArrayList<String> recAns = getStairPath(n - i);
//             for (String s : recAns)
//                 myAns.add(i + s);
//         }
//         return myAns;
//     }

// }

// 2ND TYPE OF QUESTION

// import java.io.*;
// import java.util.*;
// public class GetStairPaths {
// public static void main(String[] args){
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// ArrayList<String> paths = getStairPath(n);
// System.out.println(paths);
// }
// public static ArrayList<String> getStairPath(int n){
// if(n == 0){
// ArrayList<String> base = new ArrayList<>();
// base.add("");
// return base;
// }
// ArrayList<String> myAns = new ArrayList<>();
// for(int dice =1; dice<=6 && n-dice>=0;dice++){
// ArrayList<String> recAns =getStairPath(n-dice);
// for(String s: recAns)
// myAns.add(dice+s);
// }
// return myAns;
// }

// }