package com.guo;

@FunctionalInterface
public interface FunctionInterfaceDemo {
   void sayHello();
    default void speak(){
        System.out.println("请讲话");
    }

     static void jump() {
        System.out.println("走两步");
    }
}
