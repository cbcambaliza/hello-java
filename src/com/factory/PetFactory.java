package com.factory;

public class PetFactory {

    public static Pet getPet(PetType petType){
        switch(petType){
            case CAT : {
                return new Cat();
            }
            case DOG : {
                return new Dog();
            }

            default : {
                return null;
            }
        }
    }
}
