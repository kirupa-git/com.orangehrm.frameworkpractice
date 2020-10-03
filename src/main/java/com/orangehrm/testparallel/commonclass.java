package com.orangehrm.testparallel;

import org.testng.annotations.*;

public class commonclass {

    @BeforeClass
    void beforesuiteclass(){
        System.out.println("In Before suite class");
    }

    @AfterClass
    void aftersuiteclass(){
        System.out.println("In after suite class");
    }

}
