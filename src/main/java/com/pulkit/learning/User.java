// User.java
package com.pulkit.learning;

public class User {
    Computer device;

    public User(Computer device){
        this.device = device;
        device.compile();
    }
}
