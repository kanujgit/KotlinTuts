package com.codingquestion;

import java.util.ArrayList;
import java.util.List;

public class BreakingString {
    public static void main(String[] args) {

        String text = "One two \"three four\" five \"six seven eight\" nine \"ten\"";
        String[] splits = text.split(" ");
        List<String> list = new ArrayList<>();
        String token = null;
        for (String s : splits) {
            if (s.startsWith("\"")) {
                token = "" + s;
            } else if (s.endsWith("\"")) {
                token = token + " " + s;
                list.add(token);
                token = null;
            } else {
                if (token != null) {
                    token = token + " " + s;
                } else {
                    list.add(s);
                }
            }
        }
        String[] str = list.toArray(new String[0]);
        System.out.println(list);
    }
}
