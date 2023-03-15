package org.lessons.java;

public abstract class Animal {
    private String gender;
    private String name;
    private int age;

    //CONSTRUCTOR
    public Animal(String gender, String name, int age){
        checkString(gender, "genere");
        checkString(name, "nome");
        checkAge(age);
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    //GETTERS
    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //SETTERS
    public void setGender(String gender) {
        checkString(gender, "gender");
        this.gender = gender;
    }

    public void setName(String name) {
        checkString(name, "name");
        this.name = name;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    //METHODS


    @Override
    public String toString() {
        return  "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age;
    }

    protected void checkString(String s, String message){
        if(s.trim().isEmpty() ){
            throw new IllegalArgumentException("The " + message + " must be typed");
        }
    }

    private void checkAge(int age){
        if(age < 0){
            throw new IllegalArgumentException("The age can't be lower than zero");
        }
    }

    public void sleep(){
        System.out.println("Zzzzzz");
    }

    public abstract void sound();

    public abstract void eat();
}
