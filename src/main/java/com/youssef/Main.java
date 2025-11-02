package com.youssef;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        client.setTarget(new ProxyImpl());
        System.out.println(client.target.request());
        System.out.println(client.target.request());
        System.out.println(client.target.request());

    }
}