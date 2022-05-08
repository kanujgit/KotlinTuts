package com.codingquestion.string;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesinStringII {
    public static void main(String[] args) {
        String s = "abcd";
        int k = 3;
        Solution solution = new Solution();
        solution.removeDuplicates(s, k);
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<PairCount> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!stack.isEmpty() && c == stack.peek().c){
                if(stack.peek().count == k-1){
                    stack.pop();
                }else {
                    stack.peek().count--;
                }
            }else {
                stack.push(new PairCount(c));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (PairCount ch : stack){
            sb.append(ch.c);
        }
        return sb.toString();
    }
}

class PairCount {
    char c;
    int count;

    PairCount(char c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return Character.toString(c);
    }

}
