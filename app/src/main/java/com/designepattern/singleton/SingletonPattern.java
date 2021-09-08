package com.designepattern.singleton;


import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

public class SingletonPattern {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().hashCode());
        System.out.println(Singleton.getInstance().hashCode());
    }
}


class Singleton {
    private static volatile Singleton INSTANCE;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null)  // double check
                    INSTANCE = new Singleton();
            }
        }
        return INSTANCE;
    }

    @NonNull
    @NotNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
