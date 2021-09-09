package com.java.generic;

public class GenericsDemo {
    public static void main(String[] args) {
        Container<Object> container = new Container<>();
        container.value =1.0f;
        container.showClassName();

    }
}

class Container<T extends Object> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void showClassName(){
        System.out.println(value.getClass().getName());
    }
}
