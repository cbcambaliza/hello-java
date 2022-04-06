package com.factory;

public abstract class Pet {

    private String petName;
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Pet(){
        this.createPet();
    }

    public abstract void createPet();
}
