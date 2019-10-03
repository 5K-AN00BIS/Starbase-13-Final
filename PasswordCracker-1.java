package com.jetbrains;

// Import all from java.util.
import java.util.*;

// Begin class for PasswordCracker.
public class PasswordCracker
{
    // RunPasswordCracker method begin.
    public void RunPasswordCracker()
    {
        // Sets the passwordToCrack to the correct password.
        String passwordToCrack = "privacy";

        // Create the emoty Array List named PasswordDatabase.
        ArrayList<String> PasswordDatabase = new ArrayList<>();
        // Lines 18-27 below populates the array elements with strings.
        PasswordDatabase.add("quiet");
        PasswordDatabase.add("secret");
        PasswordDatabase.add("quarters");
        PasswordDatabase.add("spaceballs");
        PasswordDatabase.add("space");
        PasswordDatabase.add("sleepytime");
        PasswordDatabase.add("guns1234");
        PasswordDatabase.add("password");
        PasswordDatabase.add("privacy");
        PasswordDatabase.add("banana");

        // For loop
        for (String s : PasswordDatabase)
        {
            System.out.println("Attempting to use password " + s);

            // If statement that prints out a specific line when the crack password is the right one.
            if (s.equals(passwordToCrack))
            {
                System.out.println("Password has been cracked. Password was " + s + ".\nUnlocking the door.");
                break;
            }
            // When incorrect, it displays output to the user.
            else
            {
                System.out.println("Password incorrect. Attempting another password...\n");
            }
        }
    }
}