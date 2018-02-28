package com.chensr.test;

/**
 * Created by chensr on 2018/2/28.
 */
public class Singer implements Person {
    @Override
    public void perform() {
        System.out.println("我是歌手，喜欢唱歌");
    }
}
