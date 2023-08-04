package com.facade;


public class Facade {
    private SubSystemA subSystemA =new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();
    public void method(){
        subSystemA.a();
        subSystemB.b();
        subSystemC.c();
    }
}
