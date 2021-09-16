package com.codingquestion;

public class FindBalloonInString {
    public static void main(String[] args) {
        String text = "leetbaloon";
        System.out.println(findBalloon(text));

    }

    private static int findBalloon(String str) {
        int a = 0, b = 0, o = 0, l = 0, n = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            switch (str.charAt(i)) {
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'n':
                    n++;
                    break;
            }
        }
        if (a > b) {
            a = b;
        }
        if (a > l / 2) {
            a = l / 2;
        }
        if (a > o / 2) {
            a = l / 2;
        }
        if (a > n) {
            a = n;
        }

        return a;
    }
}
