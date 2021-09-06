package com.mocks.example;

public class Calculator {

    private String name;
    private Keypad keypad;

    public Calculator(String name, Keypad keypad){

        this.name = name;
        this.keypad = keypad;
    }
    public int add(int x, int y){

        return x + y;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Keypad getKeypad() {
        return keypad;
    }
}
