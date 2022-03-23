package com.codingquestion.queue;

public class BasicQueue<T> {
    private T[] data;

    private int front;
    private int end;

    public BasicQueue(int size) {
        this.front = -1;
        this.end = -1;
        data = (T[]) new Object[size];
    }

    public BasicQueue() {
        this(1000);
    }

    public int size() {
        if (front == -1 && end == -1) {
            return 0;
        } else {
            return end - front + 1;
        }
    }

    public void enQueue(T item) {
        if ((end + 1) % data.length == front) {
            throw new IllegalArgumentException("Queue is full");
        } else if (size() == 0) {
            front++;
            end++;
            data[end] = item;
        } else {
            end++;
            data[end] = item;
        }
    }


    public T deQueue() {
        T item = null;
        if (size() == 0) {
            throw new IllegalArgumentException("Queue is empty");
        }
        if (front == end) {
            item = data[front];
            data[front] = null;
            front = -1;
            end = -1;
        } else {
            item = data[front];
            data[front] = null;
            front++;
        }
        return item;
    }


    public boolean contains(T item){
        boolean found =false;

        if(size() ==0){
            return found;
        }

        for (int i = front; i < end; i++) {
            if(data[i] == item){
                found =true;
                break;
            }
        }
        return found;
    }

    public T access(int positions){
        if(size() == 0 || positions>size() ){
            throw new IllegalArgumentException("No items in the queue");
        }
        int trueIndex =0;
        for (int i = front; i < end; i++) {
         if(trueIndex == positions){
             return data[i];
         }
         trueIndex++;
        }
        throw  new IllegalArgumentException("Could not get the queue item at the "+ positions);
    }

}
