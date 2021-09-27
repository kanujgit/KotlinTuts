package com.java.collections.arraylist;


import java.util.Arrays;

public class CustomArrayList<T> {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        System.out.println(list);
    }

}

class ArrayList<T> {
    private static final int INITIAL_CAPACITY = 16;
    private Object[] elementData = {};
    private int size;

    public ArrayList() {
        elementData = new Object[INITIAL_CAPACITY];
    }

    public void add(T t) {
        if (size == elementData.length) {
            ensureCapacity();
        }
        elementData[size++] = t;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + ",Size " + size);
        }
        return (T) elementData[index];
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index);
        }
        Object removeObject = elementData[index];
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
        return removeObject;
    }

    private void ensureCapacity() {
        int newCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }
}



