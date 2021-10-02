package com.selenium.ioc;

public class Airtel implements Sim{


    @Override
    public void calling() {
        System.out.println("Calling using Airtel Sim");
        System.out.println("Some change is there");
        System.out.println("Testing 2");
        System.out.println("Test 2");

    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Airtel Sim");
    }
}
