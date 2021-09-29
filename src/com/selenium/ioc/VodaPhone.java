package com.selenium.ioc;

public class VodaPhone implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling using vodaphone Sim");

    }

    @Override
    public void data() {
        System.out.println("Browsing internet using vodaphone Sim");
    }
}
