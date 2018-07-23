package com.littleballhhh.week2;

public class Main {
    public static void main(String[] args) {
//        int a =0;
//        a=a^1;
//        int[][] abc = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int x = 1, y = 4;
        Solution657 solution657 = new Solution657();
//        System.out.println(a);
        String moves = "UD";
        System.out.println(solution657.judgeCircle(moves));
    }

}

class Solution832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int a = A.length;
        int b = A[0].length;
        int[][] args = new int[a][b];
        int temp = 0, middle = 0;
        for (int i = 0; i < a; i++) {
            for (int m = 0, n = b - 1; m < n; m++, n--) {
//                A[i][m] = (A[i][m] == 0 ? 1 : 0);
//                A[i][n] = (A[i][n] == 0 ? 1 : 0);
//                A[i][m] = A[i][m]^1;
//                A[i][n] = A[i][n]^1;
                temp = A[i][m] ^ 1;
                A[i][m] = A[i][n] ^ 1;
                A[i][n] = temp;
            }
            if (b % 2 != 0) {
                middle = b / 2;

                A[i][middle] = A[i][middle] ^ 1;
            }

        }

//        List<Integer> row = new ArrayList<Integer>();
//        for(int i=0;i<a;i++){
//            for(int j=b-1;j>=0;j--){
//                row.add((Integer) A[a][b]);
//
//            }
//            A[a] = row.toArray();
//
//        }


        return A;

    }
}

class Solution461 {
    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        String nStr = Integer.toBinaryString(n);
        int count = 0, index = 0;
        char letter = 0;


//        while (index != -1) {
//            index = nStr.indexOf("1");
//            count++;
//            if (index != -1) {
//                nStr = nStr.substring(index+1);
//            }
//            Integer.MAX_VALUE
//        }
        for (int i = 0; i < nStr.length(); i++) {
            letter = nStr.charAt(i);
            if (letter == '1') {
                count++;
            }


        }
        return count;
//        byte[] bytesN = new byte[4];
//        bytesN[0] = (byte)n;
//        bytesN[1] = (byte)(n>>8);
//        bytesN[2] = (byte)(n>>16);
//        bytesN[3] = (byte)(n>>24);


    }
}

class Solution657 {
    public boolean judgeCircle(String moves) {
        boolean result = false;
        char[] letter = moves.toCharArray();
        int x = 0, y = 0;
        for (char c : letter) {
            if (c == 'U') {
                y++;
            } else if (c == 'D') {
                y--;
            } else if (c == 'L') {
                x--;
            } else if (c == 'R') {
                x++;
            }
        }
        if (x == 0 && y == 0) {
            result = true;
        }
        return result;
    }
}
