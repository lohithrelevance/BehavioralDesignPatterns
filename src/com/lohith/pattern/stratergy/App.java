package com.lohith.pattern.stratergy;

public class App {

    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.setStrategy( new  Add());

        manager.operation( 3 , 3);
    }
}
