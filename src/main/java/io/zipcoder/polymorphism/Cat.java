package io.zipcoder.polymorphism;

public class Cat extends Pet {
    public Cat(String name) {
        super.name = name;
    }

    public Cat() {
        super();
    }

    @Override
    public void speak() {
        System.out.println("Meow");
        return;
    }
}
