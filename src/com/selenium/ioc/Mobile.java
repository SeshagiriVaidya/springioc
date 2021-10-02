package com.selenium.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("Config loaded");

        Sim sim=applicationContext.getBean("sim",Sim.class);
        sim.calling();
        sim.data();
        System.out.println("Hi");
        System.out.println("Welcome");
        System.out.println("In master change press lease");
        System.out.println("Feature branch");
        System.out.println("Hi");
        System.out.println("Fixed bug in feature");
        System.out.println("Another Bug fixed");
        System.out.println("Short feature added");

        System.out.println("Testing 1");

        System.out.println("Test 2");


      /*  Sim airtel=(Airtel) applicationContext.getBean("airtel");
        airtel.calling();
        airtel.data();*/

      /*  Sim vodaphone=applicationContext.getBean("vodaphone",VodaPhone.class);
        vodaphone.calling();
        vodaphone.data();*/





    }
}
