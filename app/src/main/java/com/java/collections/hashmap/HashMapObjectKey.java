package com.java.collections.hashmap;

import java.util.Objects;

final public class HashMapObjectKey {
    final private String name;

    public HashMapObjectKey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HashMapObjectKey)) return false;
        HashMapObjectKey student = (HashMapObjectKey) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
