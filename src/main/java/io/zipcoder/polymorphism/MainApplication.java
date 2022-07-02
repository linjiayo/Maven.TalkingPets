package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets;

        System.out.println("How many pets do you have?");
        if (!sc.hasNextInt()) {
            System.out.println("Please input a number. Exiting...");
            sc.next();
            return;
        }
        int numPets = sc.nextInt();
        sc.nextLine();
        if (numPets < 0) {
            return;
        }

        pets = new ArrayList<>(numPets);

        int counter = 0;
        while (counter < numPets) {
            System.out.printf("Is your pet number %d a Cat, a Rabbit, or a Dog?%n", counter + 1);

            String petType = sc.nextLine();
            System.out.printf("What is your pet number %d's name?%n", counter + 1);
            String petName = sc.nextLine();

            if (!isValidPetType(petType)) {
                System.out.println("Not a valid pet type");
                continue;
            }

            switch (petType.toLowerCase()) {
                case "cat":
                    pets.add(new Cat(petName));
                    break;
                case "dog":
                    pets.add(new Dog(petName));
                    break;
                case "rabbit":
                    pets.add(new Rabbit(petName));
                    break;
            }
            counter++;
        }
        for (Pet pet : pets) {
            System.out.println(pet.getName());
            pet.speak();
        }

    }

    private static boolean isValidPetType(String typeString) {
        switch (typeString.toLowerCase()) {
            case "cat":
            case "dog":
            case "rabbit":
                return true;
            default:
                return false;
        }
    }
}
