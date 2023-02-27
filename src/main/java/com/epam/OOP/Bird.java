package com.epam.OOP;

public class Bird extends Animal {
    public Bird(){
        setColor("blue");
        setFur(false);
        setNumber(2);
    }
    public Bird(String color, int numberOfPaws, boolean hasFur){
        super(color, numberOfPaws, hasFur);
    }
    @Override
    public String getDescription(){
        if(getNumberOfPaws() > 1 ) {
            if (isHasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and a fur. Moreover, it has 2 wings and can fly.";
            } else if (!isHasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and no fur. Moreover, it has 2 wings and can fly.";
            }
        }else if (getNumberOfPaws() == 1){
            if (isHasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paw and a fur. Moreover, it has 2 wings and can fly.";
            } else if (isHasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paw and no fur. Moreover, it has 2 wings and can fly.";
            }
        }else {
            return "Error";
        }
        return null;
    }
    }

