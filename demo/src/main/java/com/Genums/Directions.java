package com.Genums;

public enum Directions {
    NORTH("North"), 
    EAST("East"), 
    SOUTH("South"), 
    WEST("West");

    private final String label;

    Directions(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

}
