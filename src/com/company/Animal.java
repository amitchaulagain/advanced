package com.company;

public class Animal {

    String name;
    String color;
    String classification;

    public String getClassification() {
        return classification;
    }

    public Animal setClassification(String classification) {
        this.classification = classification;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

