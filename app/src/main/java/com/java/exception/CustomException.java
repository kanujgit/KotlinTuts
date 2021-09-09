package com.java.exception;

public class CustomException {
    public static void main(String[] args)  {
        int i=5;
        try{
            if(i>0){
                throw new MyException("error");
            }
        }catch (MyException ex){
            System.out.println(ex);
        }

    }
}
class MyException extends Exception{

    public MyException() {
        super();
    }
    public MyException(String msg) {
        super(msg);
    }
}
