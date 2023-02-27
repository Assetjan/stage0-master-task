package com.epam.OOP;

public class Animal {
    public Animal(){

    }
    public void setNumber(int numberOfPaws){
        this.numberOfPaws = numberOfPaws;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFur(boolean hasFur){
        this.hasFur = hasFur;
    }
    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.hasFur = hasFur;
        this.numberOfPaws = numberOfPaws;
    }
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public String getColor(){
        return color;
    }
    public int getNumberOfPaws(){
        return numberOfPaws;
    }
    public boolean isHasFur(){
        return hasFur;
    }
    public String getDescription(){
        if (isHasFur()){
            if (getNumberOfPaws() > 1){
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and a fur.";
            }else{
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paw and a fur.";
            }
        }else if (!isHasFur()){
            if (getNumberOfPaws() > 1){
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and no fur.";
            }else{
                return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paw and no fur.";
            }
        }else {return "Error";}
    }
}
