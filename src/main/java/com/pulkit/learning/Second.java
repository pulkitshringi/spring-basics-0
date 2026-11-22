// src/main/java/com/pulkit/learning/Second.java
package com.pulkit.learning;

public class Second {

    Third obj;

    public Second() {
        System.out.println("I'm the constructor xd");
        ;
    }

    public Third getObj() {
        return obj;
    }

    public void setObj(Third obj) {
        this.obj = obj;
    };

    public void callThirdClass() {
        obj.printtThird();
    }


}
