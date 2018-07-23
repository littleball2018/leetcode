package com.littleballhhh.week1;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        StringBuffer stringBuffer1 = new StringBuffer();
//        StringBuffer stringBuffer2 = new StringBuffer();
//        stringBuffer1.append("...");
//        stringBuffer2.append("...");
//
//
//        HashSet<String> hashSet = new HashSet<String>();
//        String str = new String(stringBuffer1);
//        hashSet.add(str);
//        str = new String(stringBuffer2);
//        hashSet.add(str);
//        System.out.println(hashSet.size());
        int [][]abc = {{1,2,3},{4,5,6},{7,8,9}};
        Solution868 solution868 = new Solution868();
        solution868.transpose(abc);

    }

}

class Solution771 {
    public int numJewelsInStones(String J, String S) {
        char[] charS = S.toCharArray();
        int count = 0;
        for (int i = 0; i < charS.length; i++) {
            if (J.indexOf(charS[i]) != -1) {
                count++;
            }
        }
        return count;
    }
}

class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        String morseStr = "\".-\",\"-...\",\"-.-.\",\"-..\",\".\",\"..-.\",\"--.\",\"....\",\"..\",\".---\",\"-.-\",\".-..\",\"--\",\"-.\",\"---\",\".--.\",\"--.-\",\".-.\",\"...\",\"-\",\"..-\",\"...-\",\".--\",\"-..-\",\"-.--\",\"--..\"";
        String r = "\"";
        morseStr = morseStr.replaceAll(r, "");
        String[] morse = morseStr.split(",");
        Map<String, String> letterMorse = new HashMap<String, String>();
        char letter = 'a';
        for (int i = 0; i < morse.length; i++) {
            letterMorse.put(String.valueOf(letter), morse[i]);
            letter++;
        }
        HashSet<String> wordsMorse = new HashSet<String>();
        StringBuffer wordMorse = new StringBuffer();
        String wordStr;
        for (int i = 0; i < words.length; i++) {
            char[] wordChar = words[i].toCharArray();
            for (int j = 0; j < wordChar.length; j++) {
                wordMorse.append(letterMorse.get(String.valueOf(wordChar[j])));
            }
            wordStr = new String(wordMorse);
            wordMorse.setLength(0);
            wordsMorse.add(wordStr);
        }
        return wordsMorse.size();
    }
}

class Solution868 {
    public int[][] transpose(int[][] A) {
        int[][] args;
        int a = A.length;
        int b = A[0].length;
        args = new int[b][a];
        for(int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                args[j][i] = A[i][j];
                //System.out.println(args[j][i]);
            }
        }
        return args;

    }
}
