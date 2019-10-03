package com.jetbrains;

// Creates the class called Spaceship.
public class Spaceship
{
    // Private instance variable for describing the ship.
    private String shipDescription;

    // Constructors
    // Uses constructor with string argument for taking in the description.
    public Spaceship(String description)
    {
        // Sets the private instance variable to the input from main.
        shipDescription = description;
    }
    // End constructors.

    // Methods
    // Creates a printDescription method to output the description on screen.
    public String printDescription()
    {
        // Prints and returns the shipDescription into the console.
        System.out.println(shipDescription);
        return shipDescription;
    }
    // End methods.
}