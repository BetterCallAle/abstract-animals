package org.lessons.java;

public class Dog extends Animal{
    private String breed;

    //CONSTRUCTOR
    public Dog(String gender, String name, int age, String breed) {
        super(gender, name, age);
        super.checkString(breed, "breed");
        this.breed = breed;
    }

    //GETTER
    public String getBreed(){
        return breed;
    }

    //SETTER
    public void setBreed(String breed){
        super.checkString(breed, "breed");
        this.breed = breed;
    }


    //METHODS


    @Override
    public String toString() {
        return super.toString() + ", " + breed;
    }

    @Override
    public void sound() {
        System.out.println("Woof woof");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating kibble");
    }
}
