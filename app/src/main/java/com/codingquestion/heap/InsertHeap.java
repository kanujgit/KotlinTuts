package com.codingquestion.heap;

import java.util.Arrays;

public class InsertHeap {
    static class MinHeap{
        int arr[];
        int size;
        int capacity;
        int cap;

        public MinHeap(int cap) {
            this.cap = cap;
            size = 0;
            capacity = cap;
            arr = new int[cap];
        }

        @Override
        public String toString() {
            return "MinHeap{" +
                    "arr=" + Arrays.toString(arr) +
                    ", size=" + size +
                    ", capacity=" + capacity +
                    ", cap=" + cap +
                    '}';
        }

        int left(int i) { return (2*i + 1); }
        int right(int i) { return (2*i + 2); }
        int parent(int i) { return (i-1)/2; }

        public void insert(int data){
            if(size == capacity) return;
            size++;
            arr[size-1] = data;

            for (int i = size-1; i!=0 && arr[parent(i)]>arr[i];) {
                int tmp =  arr[i];
                arr[i] = arr[parent(i)];
                arr[parent(i)] = tmp;
                i = parent(i);
            }
        }
    }

    public static void main(String[] args) {
        MinHeap h=new MinHeap(11);
        h.insert(3);
        h.insert(2);
        h.insert(15);
        h.insert(20);
        System.out.println(h);
    }

}
