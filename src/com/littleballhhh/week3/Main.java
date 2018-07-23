package com.littleballhhh.week3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution807 solution807 = new Solution807();
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        System.out.println(solution807.maxIncreaseKeepingSkyline(grid));

    }

}

class Solution852 {
    public int peakIndexInMountainArray(int[] A) {
        int result;
        int i = 0;
        while (A[i] < A[i + 1]) {
            i++;
        }
        result = i;
        return result;
    }
}

class Solution806 {
    public int[] numberOfLines(int[] widths, String S) {
        char[] s = S.toCharArray();
        int[] result;
        int width = 0;
        int lines = 0;
        int sum = 0;
        for (int i = 0; i < s.length; ) {
            sum = 0;
            while (sum <= 100 && i < s.length) {
                sum = sum + widths[s[i] - 97];
                i++;

            }
            if (i != s.length || sum > 100) {
                i = i - 1;
            }

            lines++;
        }
        result = new int[]{lines, sum};
        return result;
    }
}

class Solution807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int length = grid.length;
        int[] leftToRight = new int[length];
        int[] topToBottom = new int[length];
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            leftToRight[i] = sortMax(grid[i]);
            for (int j = 0; j < length; j++) {
                temp[j] = grid[j][i];

            }
            topToBottom[i] = sortMax(temp);
        }
        for(int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                result = result+(compareMin(leftToRight[i],topToBottom[j])-grid[i][j]);
            }
        }

//        System.out.println(Arrays.toString(leftToRight));
//        System.out.println(Arrays.toString(topToBottom));
        return result;
    }

    public int sortMax(int[] list) {
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            if (max < list[i])
                max = list[i];
        }
        return max;
    }

    public int compareMin(int x, int y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }
}


