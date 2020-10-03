package com.orangehrm.oop;

import org.testng.annotations.Test;

public class childrenclass  extends parentclass{

    public static void main(String[] args) {
        parentclass nn = new childrenclass();
        nn.property();
        nn.marriage();
    }

    @Override
    public  void marriage() {
        System.out.println("my rules");
    }
}
