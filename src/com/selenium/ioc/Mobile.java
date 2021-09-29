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


      /*  Sim airtel=(Airtel) applicationContext.getBean("airtel");
        airtel.calling();
        airtel.data();*/

      /*  Sim vodaphone=applicationContext.getBean("vodaphone",VodaPhone.class);
        vodaphone.calling();
        vodaphone.data();*/





    }
}
