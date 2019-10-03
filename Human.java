package com.jetbrains;

// Creates a Human subclass, under the Lifeform superclass.
public class Human extends Lifeform
{
    // This is just like all the other constructors that have been created.
    // A description is required since the superclass also needs it.
    public Human(String description)
    {
        // Sends the superclass required data for its constructor.
        super(description);
    }

    // Creates a method for shaking the person's hand and just printing the greeting.
    public void shakeHands()
    {
        System.out.println("You shake hands with the person as a greeting. This is a well known process " +
                "used for meeting people back home.");
    }
}