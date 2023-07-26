package com.facade;

import com.sun.org.apache.bcel.internal.generic.NEW;

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
