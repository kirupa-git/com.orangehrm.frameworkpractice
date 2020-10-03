package com.orangehrm.testparallel;

import org.testng.annotations.Test;

public class class1 extends commonclass {


    void class1test1(){
        System.out.println("In class1- test1");
    }


    void class1test2(){
        System.out.println("In class1- test2");
    }

    @Test
    void ascs(){
        class1test1();
        class1test2();
    }
}
