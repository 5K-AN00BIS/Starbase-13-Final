package com.jetbrains;

public class Room
{
    // Private instance variable for describing the Crew Quarters.
    private String roomDescription;

    // Constructors
    // Uses constructor with string argument for taking in the description.
    public Room(String description)
    {
        // Sets the private instance variable to the input from main.
        roomDescription = description;
    }
    // End constructors.

    // Methods
    // Creates a printDescription method to output the description on screen.
    public String printDescription()
    {
        // Prints and returns the shipDescription into the console.
        System.out.println(roomDescription);
        return roomDescription;
    }
    // End methods.
}