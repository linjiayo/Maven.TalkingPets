package io.zipcoder.polymorphism;

public class Pet {
    String name;

    public Pet() {
        name = "Pet";
    }

    public Pet(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.printf("I am %s%n", getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

