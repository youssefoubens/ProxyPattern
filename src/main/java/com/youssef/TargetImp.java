package com.youssef;

public class TargetImp implements Target{
    @Override
    public Double request() {

        System.out.println("request");
        return Math.random()*10 + Math.sqrt(5);
    }
}
