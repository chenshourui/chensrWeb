package com.chensr;

/**
 * Created by chensr on 2018/2/25.
 */
public class HelloWorld {
    public String name;

    public void say(){
        System.out.println(this.getName()+": hello spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
