package com.java.string;

public class StringDemo {
    public static void main(String[] args) {
        String s = new String("Anuj");
        String s1 = "Anuj1";
        System.out.println(s == s1);
        System.out.println(s.hashCode() +" \t "+s1.hashCode());
        System.out.println(s == s1);
        System.out.println(s.equals(s1));

        int x =0;
        int y=0;
        for (int i = 0; i < 5; i++) {

            if((++x >2 ) && (++y >2)){
                x++;
            }
        }
        System.out.println(x +" "+y);
    }
}
