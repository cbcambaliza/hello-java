package com.factory;

/** Factory Pattern
 * Doesn't expose instantiation logic
 * Defer to subclasses
 * Common interface
 * Specified by architecture, implemented by user
 * Examples: Calendar, ResourceBundle, NumberFormat
 *
 * Factory is responsible for lifecycle
 * Common Interface
 * Concrete Classes
 * Parameterized create method
 */

public class FactoryDemo {

    public static void main(String[] args){
        Pet cat = PetFactory.getPet(PetType.CAT);
        Pet dog = PetFactory.getPet(PetType.DOG);

        System.out.println(cat + " " + cat.getPetName());
        System.out.println(dog + " " + dog.getPetName());
    }
}
