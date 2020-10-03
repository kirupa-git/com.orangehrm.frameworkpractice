package com.orangehrm.oop;

public class GetandSet {

    private String kirupaagar;
    static int x=10;

    public String getKirupaagar(){
        return kirupaagar;
    }

    public String setKirupaagar(String newname){
        this.kirupaagar=newname;
        return newname;
    }

    public static void main(String[] args) {
        System.out.println(GetandSet.x);
        GetandSet.x=25;
        System.out.println(GetandSet.x);
        GetandSet names = new GetandSet();
        System.out.println(names.kirupaagar);
        System.out.println(names.setKirupaagar("sridevi"));
        System.out.println(names.getKirupaagar());


    }
}
