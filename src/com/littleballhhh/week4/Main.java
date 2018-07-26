package com.littleballhhh.week4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int left=1;
        int right=22;
        Solution728 solution728 = new Solution728();
        System.out.println(solution728.selfDividingNumbers(left,right));

    }
}

class Solution709 {
    public String toLowerCase(String str) {
        char[] word = str.toCharArray();
        StringBuffer result=new StringBuffer();
        for (int i=0;i<word.length;i++) {
            if(word[i]>=65&&word[i]<=90){
                word[i] = (char)(word[i]+32);
            }
            result.append(word[i]);

        }
        return new String(result);
    }
}

class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=left;i<right+1;i++){
            if(isSelfDividingNumbers(i)){
                numbers.add(i);
                //System.out.println(i);
            }
        }
        return numbers;


    }

    public boolean isSelfDividingNumbers(int n){
        String string = String.valueOf(n);
        if(string.indexOf('0')>-1){
            return false;
        }
        char[] numbers = string.toCharArray();
        int i=0;
        while(n%(numbers[i]-'0')==0&&i<numbers.length+1){
            i++;
            if(i==numbers.length){
                return true;
            }
        }
        return false;
    }
}
