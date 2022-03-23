package com.codingquestion.stack;

public class BasicStack<T> implements Stack{
    private T [] data;
    private int stackPointer;

    public BasicStack() {
        data = (T[]) new Object[1000];
        stackPointer =0;
    }

    @Override
    public void push(Object o) {
        data[stackPointer++] = (T) o;
    }

    @Override
    public Object pop() {
        if(stackPointer==0)
            throw new RuntimeException("no more item on the stack");
        return data[stackPointer--];
    }

    @Override
    public boolean contains(Object o) {
        boolean found =false;
        for (int i = 0; i < stackPointer; i++) {
            if(data[i].equals(o)){
                found =true;
                break;
            }
        }
        return found;
    }

    @Override
    public Object access(Object item) {
        while (stackPointer>0){
            Object tmpItem = pop();
              if(item.equals(tmpItem)){
                return tmpItem;
            }
        }
        throw new RuntimeException("Could not found item on the stack "+item);
    }

    public int size(){
        return stackPointer;
    }
    public void printItem(){
        if(stackPointer ==0){
            System.out.println("No item in the stack");
        }
        for (int i = 0; i < stackPointer; i++) {
            System.out.println(data[i]);
        }
    }

}
