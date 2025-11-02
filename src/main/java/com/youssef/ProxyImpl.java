package com.youssef;

public class ProxyImpl implements Target{


    Target target =new TargetImp();


    @Override
    public Double request() {
        if(target == null)
            target = new TargetImp();
        System.out.println("request via proxy");
        return target.request();

    }
}
