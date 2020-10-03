package com.orangehrm.testparallel;

import org.testng.annotations.Test;

public class class2 extends commonclass{

    commonclass xx = new commonclass();





    void class2test1(){
        System.out.println("In class2- test1");
    }


    void class2test2(){
        System.out.println("In class2- test2");

    }

    @Test
    void adxa(){
        class2test1();;
        class2test2();
    }



}
