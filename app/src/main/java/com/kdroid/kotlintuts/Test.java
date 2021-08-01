package com.kdroid.kotlintuts;

import java.lang.reflect.Field;

class BOB {
    int i;

    protected void bobMethod() {
    }
}

class BOB2 extends BOB {

    @Override
    protected void bobMethod() {
        super.bobMethod();
    }
}

public class Test {

    /*public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(Boolean.parseBoolean("ds"));
        list.add(Boolean.TRUE);
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.get(1) instanceof Boolean);
    }*/
    //-----------------------------------------------------//
//    static int count=  0;
//    public static void main(String[] args) {
//        if (count<3){
//            count++;
//            main(null);
//        }else {
//            return;
//        }
//        System.out.println("Hello world");
//    }
//    /**
//     * Hello world
//     * Hello world
//     * Hello world
//     */
//


//    public static void main(String[] args) {
//        //boolean falg= "nifty".getClass().getSimpleName().equals("String");
//        boolean falg= "nifty" instanceof String;
//        System.out.println(falg);
//    }


//    public static void main(String[] args) {
//        String str = "Hello world";
//        String newMsg= str.substring(0,1);
//        System.out.println(newMsg);
//
//}

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        BOB bob;
        BOB2 bob2 = new BOB2();
//        String s1 = "java";
//        String s2 = "java";
//        String s3 = new String("java");
//        String s6  =  "ja" + "va";
//
//        char ch[] = {'j', 'a', 'v', 'a'};
//        String s4 = new String(ch);//converting char array to string
//        String s5 = new String("java");

//        System.out.println(showInternalCharArrayHashCode(s1));
//        System.out.println(showInternalCharArrayHashCode(s3));
//        System.out.println(showInternalCharArrayHashCode(s6));
//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s4));


        //      System.out.println(s1 == s6);
//
//        System.out.println(s1.hashCode() + "\n" + s2.hashCode() + "\n" + s3.hashCode() + "\n" + s4.hashCode() + "\n" + s5.hashCode() + "\n"+ "\n" + s6.hashCode() + "\n");

    }

    private static int showInternalCharArrayHashCode(String s) throws NoSuchFieldException, IllegalAccessException {
        final Field value;
        value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        return value.get(s).hashCode();
    }


// Java program to compare performance
// of string literal and string object

//    public static void main(String args[]) {
//        // Initialization time for String
//        // Literal
//        long start1 = System.currentTimeMillis();
//
//        for (int i = 0; i < 10000; i++) {
//            String s1 = "GeeksForGeeks";
//            String s2 = "Welcome";
//        }
//
//        long end1 = System.currentTimeMillis();
//        long total_time = end1 - start1;
//
//        System.out.println("Time taken to execute" +
//                " string literal = " + total_time);
//
//        // Initialization time for String
//        // object
//        long start2 = System.currentTimeMillis();
//
//        for (int i = 0; i < 10000; i++) {
//            String s3 = new String("GeeksForGeeks");
//            String s4 = new String("Welcome");
//        }
//
//        long end2 = System.currentTimeMillis();
//        long total_time1 = end2 - start2;
//
//        System.out.println("Time taken to execute" +
//                " string object=" + total_time1);
//    }
}

