package com.selenium.ioc;

public class Airtel implements Sim{


    @Override
    public void calling() {
        System.out.println("Calling using Airtel Sim");
        System.out.println("Inside the Airtel");

    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Airtel Sim");
    }
}
