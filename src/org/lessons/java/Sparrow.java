package org.lessons.java;

public class Sparrow extends Animal{
    private String color;

    //CONSTRUCTOR
    public Sparrow(String gender, String name, int age, String color) throws IllegalArgumentException {
        super(gender, name, age);
        super.checkString(color, "color");
        this.color = color;
    }

    //GETTER
    public String getColor() {
        return color;
    }

    //SETTER
    public void setColor(String color) {
        super.checkString(color, "color");
        this.color = color;
    }

    //METHODS

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }

    @Override
    public void sound() {
        System.out.println("Cheep cheep");
    }

    @Override
    public void eat() {
        System.out.println(super.eatMessage() + "sunflower seeds");
    }
}
