package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class B {

    @Autowired
    private A a;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
