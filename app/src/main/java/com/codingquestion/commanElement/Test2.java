package com.codingquestion.commanElement;

import java.util.Objects;

public class Test2 {
    String a;
    String b;


    public Test2(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }


    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test1)) return false;
        Test1 test1 = (Test1) o;
        return Objects.equals(getA(), test1.getA()) &&
                Objects.equals(getB(), test1.getB());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB());
    }
}
