package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        try {
            Dog dog = new Dog("male", "Link", 1, "Beagle");
            dog.eat();
            dog.sound();
            dog.sleep();
            System.out.println("-----------");
            Sparrow sparrow = new Sparrow("female", "Zelda", 2, "black");
            sparrow.eat();
            sparrow.sound();
            sparrow.sleep();
            sparrow.fly();
            System.out.println("-----------");
            Eagle eagle = new Eagle("female", "Ellie", 4, "royal");
            eagle.eat();
            eagle.sound();
            eagle.sleep();
            eagle.fly();
            System.out.println("-----------");
            Dolphin dolphin = new Dolphin("male", "Joel", 5);
            dolphin.eat();
            dolphin.sound();
            dolphin.sleep();
            dolphin.swim();
            System.out.println("-----------");

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
