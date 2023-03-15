package org.lessons.java;

public class Dolphin extends Animal{

    public Dolphin(String gender, String name, int age) throws IllegalArgumentException {
        super(gender, name, age);
    }

    //METHODS
    @Override
    public void sound() {
        System.out.println("click click");
    }

    @Override
    public void eat() {
        System.out.println(super.eatMessage() + "squids");
    }
}
