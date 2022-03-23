package com.codingquestion.stack;

public interface Stack<T> {

    void push(T t);

    T pop();

    boolean contains(T t);

    T access(T t);

}
