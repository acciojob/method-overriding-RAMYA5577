package com.driver;
public class B extends A {

    @Override
    public String meth() {
        A a=new A();
        return a.meth();
    }
}
