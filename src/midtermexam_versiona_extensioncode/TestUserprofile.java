/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Md Sowad
 */
import java.util.Scanner;

public class TestUserprofile {
    
    public static void main(String[] args) {
        
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Display the possible genres and prompt the user to choose one
        System.out.println("Possible genres:");
        System.out.println("1. Comedy");
        System.out.println("2. Drama");
        System.out.println("3. Action");
        System.out.println("4. Horror");
        System.out.println("5. Sci-Fi");
        System.out.println("Please choose your favourite genre (enter the corresponding number):");
        int genreChoice = scanner.nextInt();
        
        // Map the user's genre choice to a genre string
        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Comedy";
                break;
            case 2:
                genre = "Drama";
                break;
            case 3:
                genre = "Action";
                break;
            case 4:
                genre = "Horror";
                break;
            case 5:
                genre = "Sci-Fi";
                break;
            default:
                System.out.println("Invalid genre choice.");
                return;
        }
        
        // Prompt the user to enter their name
        System.out.println("Please enter your name:");
        String name = scanner.next();
        
        // Create a new UserProfile object with the user's name and favourite genre
        UserProfile userProfile = new UserProfile(name, genre);
        
        // Display a message indicating that the user's profile was created
        System.out.println("Your userProfile was created.");
        
    }
    
}
