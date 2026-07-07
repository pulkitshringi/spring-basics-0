// src/main/java/com/pulkit/learning/App.java
package com.pulkit.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("anyName.xml");
        Second obj = (Second) context.getBean("Second");
        obj.secondFunc();
    }
}
