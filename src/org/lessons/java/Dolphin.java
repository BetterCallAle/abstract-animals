package org.lessons.java;

public class Dolphin extends Animal implements CanSwim{

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

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
