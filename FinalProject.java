// Package for use with commercial applications. I am using jetbrains as there is no business need for this right now.
package com.jetbrains;

/* Import swing class called JOptionPane from javax. This allows me to bring up option pane for dialog as seen in
   my main method. */
import javax.swing.JOptionPane;
import java.util.*;

/* Begin FinalProject class. This is creating my own personal class called FinalProject, allowing custom steps be made
   rather than relying on premade classes such as JOptionPane, LocalDate, Etc. */
public class FinalProject
{
    // Begin main, where all program steps are taken and run.
    public static void main(String[] args)
    {
        /* Brings up a dialog pane that outputs the string entered below and sets user input as variable "name" and
           stores it for later use. */
        String name = JOptionPane.showInputDialog("HAL: 'My name is Heuristacally Programmed Algorithmic Computer! You can " +
                "call me HAL for short. What is your name?'");

        // Basic println statement, but includes /n to drop down a line, as well as calling the entered name in the middle.
        System.out.println("\nHAL: 'Identity confirmed. Thank you " + name + ". You will be arriving at Starbase 13 " +
                "momentarily.'");

        // Begin storytelling, using println statements that outputs the strings I've designated below.
        System.out.println("\nThe over-friendly computer voice fades away with a quiet beep.");
        System.out.println("The window covers hum quietly as they all rise at once automatically.");
        System.out.println("The vast expanse and reflective light from Earth is what's seen first as the blinds open. " +
                "This makes you extremely nervous to say the least.");
        System.out.println("After a minute or so, you notice your destination coming into view.");
        System.out.println("Printed in large, stencil like numbers on the side of the structure is the number 13.");
        System.out.println("'This must be Starbase 13', you think to yourself.");
        System.out.println("The station is absolutely massive and covered in all sorts of devices I couldn't even " +
                "begin to explain.");
        System.out.println("Surprisingly enough, the color is very grey which was a boring choice.");
        System.out.println("The tender docks smoothly with Starbase 13 near a large group of solar panels which provide" +
                " power to the base.");
        System.out.println("Being in the back of the tender, you wait patiently for other passengers to depart.");
        System.out.println("Finally. Your turn. You exit the transpo ship and enter the hangar bay...\n\n");

        // Hangar bay assignment and storytelling begins.
        System.out.println("Upon entering the large hangar space, you notice the diverse cultures and ship types aboard.");
        System.out.print("The first thing that catches your eye is an alien life form. It has ");

        // Lifeform objects.
        // Create the lifeformOne object from the Lifeform class and sets the description.
        Lifeform lifeformOne = new Lifeform("blue skin and feelers coming from multiple extremities.\n");
        // Uses the printDescription method to print the description given from the above object creation.
        lifeformOne.printDescription();

        System.out.println("As this sparks your interest, you begin taking in all of the other life forms in the bay. ");
        System.out.print("Another alien life form you notice has ");

        // Create the lifeformTwo object from the Lifeform class and sets the description.
        Lifeform lifeformTwo = new Lifeform("red skin and horns growing from their head like a demon.\n");
        // Uses the printDescription method to print the description given from the above object creation.
        lifeformTwo.printDescription();

        System.out.print("A third alien ");

        // Create the lifeformThree object from the Lifeform class and sets the description.
        Lifeform lifeformThree = new Lifeform("looks like it's completely made of stone.\n");
        // Uses the printDescription method to print the description given from the above object creation.
        lifeformThree.printDescription();

        System.out.print("A fourth alien has ");

        // Create the lifeformFour object from the Lifeform class and sets the description.
        Lifeform lifeformFour = new Lifeform("grey skin and large black eyes, just like they always" +
                " talked about on television and movies.\n");
        // Uses the printDescription method to print the description given from the above object creation.
        lifeformFour.printDescription();

        System.out.print("The last alien race has ");

        // Create the lifeformFive object from the Lifeform class and sets the description.
        Lifeform lifeformFive = new Lifeform("blond hair and looks just like we do but plastic. Strange.\n");
        // Uses the printDescription method to print the description given from the above object creation.
        lifeformFive.printDescription();

        System.out.println("There were all types of life forms roaming about. After the initial shock, the spaceships" +
                " catch your attention.");
        System.out.println("There were 5 different ship types as well, likely for the 5 separate races.\nThere was:");

        // Ship objects.
        // Create the shipOne object from the Spaceship class and sets the description.
        Spaceship shipOne = new Spaceship("A white one with blue stripes.");
        // Uses the printDescription method to print the description given from the above object creation.
        shipOne.printDescription();

        // Create the shipTwo object from the Spaceship class and sets the description.
        Spaceship shipTwo = new Spaceship("A blue one covered in green dots.");
        // Uses the printDescription method to print the description given from the above object creation.
        shipTwo.printDescription();

        // Create the shipThree object from the Spaceship class and sets the description.
        Spaceship shipThree = new Spaceship("A chrome orb with no attributable features.");
        // Uses the printDescription method to print the description given from the above object creation.
        shipThree.printDescription();

        // Create the shipFour object from the Spaceship class and sets the description.
        Spaceship shipFour = new Spaceship("A dull silver disc type craft.");
        // Uses the printDescription method to print the description given from the above object creation.
        shipFour.printDescription();

        // Create the shipFive object from the Spaceship class and sets the description.
        Spaceship shipFive = new Spaceship("A militaristic one that looks like a Blackbird military craft.\n");
        // Uses the printDescription method to print the description given from the above object creation.
        shipFive.printDescription();

        // SECURITY ASSIGNMENT CONTINUES BELOW
        System.out.println("You stare in awe at the sights a moment longer before making your way through the ship.");
        System.out.println("The ship is gargantuan in size and labyrinthine in nature but there are two main adjoining " +
                "spaces you can go.");

        // Create a password input variable as a string.
        String passwordInput = "";
        // Get password to the crew quarters from the user.
        Scanner getPasswordForQuarters = new Scanner(System.in);

        // Create the quarters object from the CrewQuarters class and sets the description.
        Room crewQuarters = new Room("\nYou enter the Crew Quarters.\nYou notice a colorful assortment of bunks with" +
                " different bedding and colorful posters decorate most of the blank space in the room.\nYou put " +
                "your belongings on an empty bunk and soak in the environment for a moment.\n");

        // Create the cafe object from the Cafeteria class and sets the description.
        Room cafeteria = new Room("\nUpon entering the room, you smell a heavenly " +
                "smell that you've never experienced.\nIt smelled even better than home cooking. This " +
                "could only be the cafeteria, and a damn good one at that.");

        // Begin while loop.
        while (!passwordInput.equals("privacy")) {

            /* Uses JOptionPane for GUI integration. Uses Integer.parseInt to convert the string entered into an integer.
             * JOptionPane usually only takes a string from users so we needed to make it into an int. This may cause errors
             * If they don't enter an integer, I will need to add code to get around this issue. */
            int roomOption = Integer.parseInt(JOptionPane.showInputDialog("Where would you like to go?\nEnter 1 for Crew Quarters.\n" +
                    "Enter 2 for Cafeteria.\nEnter 3 to head back to the hangar."));

            // Switch statement for room information.
            switch (roomOption)
            {
                case 1:
                    // Crew Quarters
                    System.out.println("Upon walking up to the room adorned with a plaque that says 'Crew Quarters' " +
                            "you realize it is protected by a code lock.\n");
                    System.out.println("The touchscreen shows a full keyboard and asks for a password.\n");

                    // GUI box asking user what they want to do.
                    int passwordChoice = Integer.parseInt(JOptionPane.showInputDialog("How would you like to enter the room?" +
                            "\nEnter 1 for traditional password entry.\n" +
                            "Enter 2 for using your password cracker.\n"));

                    // Switch statement handling whether or not the user wants to manually enter a password or use the cracker.
                    switch (passwordChoice)
                    {
                        // Case 1 handles the traditional password entry route.
                        case 1:
                            System.out.println("Please enter the password: ");

                            // Holds the password the user is entering.
                            passwordInput = getPasswordForQuarters.nextLine();

                            // If statement handling user password tries.
                            if (passwordInput.equals("privacy")) {
                                // Password entered was correct.
                                // Uses the printDescription method to print the description given from the above object creation.
                                crewQuarters.printDescription();

                                // Creates a new bunkmate object under the Human subclass.
                                Human bunkmate = new Human("You meet your temporary bunkmate. This was a tall " +
                                        "man with light skin. They seem battle hardened so you assume it's a soldier " +
                                        "assigned for ship protection.\n");
                                // Print the above description for meeting your bunkmate.
                                bunkmate.printDescription();

                                System.out.println("In the bunks near yours, you see a few more fellow humans that are " +
                                        "bound to be your neighbors for the time being. You feel that it should be time " +
                                        "to greet them.\n");

                                // Creates a new neighbor object under the Human subclass.
                                Human neighbor1 = new Human("The neighbor left of you is a short man with " +
                                        "a Boston type accent. He has slicked back hair and looks like someone " +
                                        "right out of a World War 2 documentary.");
                                // Print the above description for meeting your neighbor.
                                neighbor1.printDescription();
                                // Shake hands with your neighbor.
                                neighbor1.shakeHands();

                                // Creates a new neighbor object under the Human subclass.
                                Human neighbor2 = new Human("\nThe neighbor to your right is a mousy man. Hair is dark " +
                                        "and greasy and he seems relatively quiet.");
                                // Print the above description for meeting your neighbor.
                                neighbor2.printDescription();
                                // Shake hands with your neighbor.
                                neighbor2.shakeHands();

                                System.out.println("\nAfter meeting your neighbors in the crew quarters, you hear a soft bark sound... " +
                                        "Lo and behold, you see something you never thought you'd see in space. A dog!");

                                // Creates a new pupper1 object under the Dog subclass with a description and breed.
                                Dog pupper1 = new Dog("The dog was fawn in color and was quite large. It had " +
                                        "droopy ears and large jowls.", "English Mastiff");
                                // Find out the breed of the dog.
                                pupper1.discoverBreed();
                                // Pets the dog and will loop as long as the player wants to for companionship.
                                pupper1.petPupper();
                            }
                            else
                            {
                                // Password was incorrect.
                                System.out.println("\nThe screen flashes and shows 'That password was incorrect.\n" +
                                        "Please see the residential coordinator if you've " +
                                        "forgotten your password.'");
                                // Goes back to enter password prompt and take user input again.
                            }

                            break;
                        // Case 2 handles the password cracking route.
                        case 2:
                            // Creates the password cracker using the PasswordCracker class.
                            PasswordCracker passwordCracker = new PasswordCracker();
                            // Runs the array version of the cracker.
                            passwordCracker.RunPasswordCracker();
                            // Sets password to privacy to close out the loop. Need to work on not manually setting
                            // passwordInput to privacy and instead pass it automatically from the array.
                            passwordInput = "privacy";

                            // Password cracker works and enters the correct password.
                            // Uses the printDescription method to print the description given from the above object creation.
                            crewQuarters.printDescription();

                            // FINAL PROJECT BEGIN
                            // Creates a new bunkmate object under the Human subclass.
                            Human bunkmate = new Human("You meet your temporary bunkmate. This was a tall " +
                                    "man with light skin. They seem battle hardened so you assume it's a soldier " +
                                    "assigned for ship protection.\n");
                            // Print the above description for meeting your bunkmate.
                            bunkmate.printDescription();

                            System.out.println("In the bunks near yours, you see a few more fellow humans that are " +
                                    "bound to be your neighbors for the time being. You feel that it should be time " +
                                    "to greet them.\n");

                            Human neighbor1 = new Human("The neighbor left of you is a short man with " +
                                "a Boston type accent. He has slicked back hair and looks like someone " +
                                "right out of a World War 2 documentary.");
                            neighbor1.printDescription();
                            neighbor1.shakeHands();

                            Human neighbor2 = new Human("\nThe neighbor to your right is a mousy man. Hair is dark " +
                                    "and greasy and he seems relatively quiet.");
                            neighbor2.printDescription();
                            neighbor2.shakeHands();

                            System.out.println("\nAfter meeting your neighbors in the crew quarters, you hear a soft bark sound... " +
                                    "Lo and behold, you see something you never thought you'd see in space. A dog!");

                            Dog pupper1 = new Dog("The dog was fawn in color and was quite large. It had " +
                                    "droopy ears and large jowls.", "English Mastiff");
                            pupper1.discoverBreed();
                            pupper1.petPupper();

                            break;
                        // Default case that handles if user enters anything besides 1 or 2.
                        default:
                            System.out.println("You are doing things incorrectly. Going back to room selection...\n");

                            break;
                    }

                    break;
                case 2:
                    // Cafeteria
                    // Uses the printDescription method to print the description given from the above object creation.
                    cafeteria.printDescription();
                    System.out.println("It's not time to eat yet, you need to settle into the crew quarters first.\n");

                    break;
                case 3:
                    // Back to hangar.
                    // Change to descriptions with objects.
                    System.out.println("\nYou're back to where you began. You leaving already?!\n");
                    break;
                default:
                    System.out.println("\nEveryone is looking at you funny. You're just walking in circles here... ");
                    System.out.println("You have been arrested by the ship's police for being completely inebriated.");
                    System.out.println("You are shortly released because toxicology reports are clean and they can't arrest crazy.");
                    System.out.println("You set back onto your path.");

                    break;
            }
        }
    }
    // End main.
}
// End Security class.