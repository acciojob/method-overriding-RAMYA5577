package com.driver;
public class Main {

    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A {

        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
        public static void main(String args[]){
      A a=new B();
//      B b=new A();
//      System.out.println(a.meth());
      System.out.println(a.meth());
    }
}
