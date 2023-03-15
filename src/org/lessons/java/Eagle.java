package org.lessons.java;

public class Eagle extends Animal{
    private String type;

    //CONSTRUCTOR
    public Eagle(String gender, String name, int age, String type) throws IllegalArgumentException {
        super(gender, name, age);
        super.checkString(type, "type");
        this.type = type;
    }

    //GETTER
    public String getType() {
        return type;
    }

    //SETTER
    public void setType(String type) {
        super.checkString(type, "type");
        this.type = type;
    }

    //METHODS
    @Override
    public String toString() {
        return super.toString() + ", " + type;
    }

    @Override
    public void sound() {
        System.out.println("Screech screech");
    }

    @Override
    public void eat() {
        System.out.println(super.eatMessage() + "meat");
    }
}
