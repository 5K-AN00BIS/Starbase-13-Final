package com.jetbrains;

// Creates the superclass called Lifeform.
public class Lifeform
{
    // Private instance variable for describing the aliens.
    private String formDescription;

    // Constructors
    // Uses constructor with string argument for taking in the description.
    public Lifeform(String description)
    {
        // Sets the private instance variable to the input from main.
        formDescription = description;
    }
    // End constructors.

    // Methods
    // Creates a printDescription method to output the description on screen.
    public String printDescription()
    {
        // Prints and returns the shipDescription into the console.
        System.out.println(formDescription);
        return formDescription;
    }
    // End methods.
}