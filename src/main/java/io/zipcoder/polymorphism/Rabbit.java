package io.zipcoder.polymorphism;

public class Rabbit extends Pet{
    public Rabbit(String name) {
        super.name = name;
    }

    public Rabbit() {
        super();
    }

    @Override
    public void speak() {
        System.out.println("Squeak!");
    }
}
