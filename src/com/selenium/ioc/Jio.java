package com.selenium.ioc;

public class Jio implements Sim{


    @Override
    public void calling() {
        System.out.println("Calling using Jio Sim");
        System.out.println("Again changed");

    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Jio Sim");
    }
}
