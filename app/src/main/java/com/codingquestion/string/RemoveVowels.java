package com.codingquestion.string;

public class RemoveVowels {
    public static void main(String[] args) {
        String s = "Anuj";
        removeVowels(s);
        for (Character c : s.toCharArray()
        ) {

        }
    }

    private static void removeVowels(String s) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'A':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    continue;
            }
            buffer.append(s.charAt(i));
        }
        System.out.println(buffer);
    }

}
