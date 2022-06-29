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
        System.out.println("Hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

