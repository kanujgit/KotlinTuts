package com.java.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
    public static void main(String[] args){

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
