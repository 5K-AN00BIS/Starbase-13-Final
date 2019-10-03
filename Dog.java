package com.jetbrains;

import java.util.*;

// Creates a Human subclass, under the Lifeform superclass.
public class Dog extends Lifeform
{
    private String Breed;
    private int relationshipLevel;
    private String Name;

    // This is just like all the other constructors that have been created.
    // A description is required since the superclass also needs it.
    public Dog(String description, String breed)
    {
        // Sends the superclass required data for its constructor.
        super(description);
        Breed = breed;
    }

    // Method for discovering the dog breed. Uses the Breed string entered after the description.
    public void discoverBreed()
    {
        System.out.println("The dog looks at you happily while you try and figure out it's breed. " +
                "It looks like an " + Breed + "!");
    }

    // Method for petting a pupper.
    public void petPupper()
    {
        // Char used for looping.
        char petAgain = 'y';

        // While loop that allows the player to pet again if they want.
        while (petAgain == 'y') {
            System.out.println("The dog must not know how to shake hands (or paw). You pat the pup on its head and " +
                    "it pants happily.\n");
            // Adds 5 to the relationship level for possible companionship.
            relationshipLevel += 5;
            // Prints current relationship level.
            System.out.println("Current companionship level: " + relationshipLevel + "\n");

            if (relationshipLevel >= 15) {
                System.out.println("You just got a new companion. Please enter a name: ");
                // Scanner for user input to give the dog a name.
                Scanner getName = new Scanner(System.in);
                // Sets Name to what is being entered.
                Name = getName.next();
                System.out.println("Your new companion named " + Name + " is now following you. Nothing else " +
                        "is needed not that you have a dog companion... YOU WIN!! \n\nGame over!");

                // Break to end loop and stop potential infinite loop.
                break;
            }
            else
            {
                // Asks if the player wants to pet them again because there is no other option.
                System.out.println("Would you like to pet them again? y or n: ");
                // Another scanner input to see if the user wants to play again.
                Scanner loop = new Scanner(System.in);
                // Gets the next char since petAgain is a char and Scanner brings in Scanner.
                petAgain = loop.next().charAt(0);
            }
        }
    }
}