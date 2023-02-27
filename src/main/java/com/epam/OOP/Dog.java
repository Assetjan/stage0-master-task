package com.epam.OOP;

public class Dog extends Animal {
    public Dog(){
        setColor("brown");
        setFur(true);
        setNumber(4);
    }
    public Dog(String color, int numberOfPaws, boolean hasFur){
        super(color, numberOfPaws, hasFur);
    }
    @Override
    public String getDescription(){
        if(getNumberOfPaws() > 1 ) {
            if (isHasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and a fur.";
            } else if (!isHasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and no fur.";
            }
        }else if (getNumberOfPaws() == 1){
            if (isHasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paw and a fur.";
            } else if (!isHasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paw and no fur.";
            }
        }else {
            return "Error";
        }
        return null;
    }
}
