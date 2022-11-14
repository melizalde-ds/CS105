//Author: Miguel Elizalde Cruz

package week3;

import java.util.Scanner;

public class HelloWorldRevised {
    public static void main(String[] args) {
        // Here I create an Scanner to receive the input from the user.
        Scanner in = new Scanner(System.in);

        // Introduction: Name
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("Hello " + name + "!\n");

        // Question 1: Country
        System.out.println("Where are you from?");
        String country = in.nextLine();
        System.out.println(country + " is a beautiful place!");
        System.out.println("I am from California, but I would have love to be from Finland. I could be a Nerdic.\n");

        // Question 2: Dessert
        System.out.println("What is your favorite dessert?");
        String dessert = in.nextLine();
        System.out.println("I hope you like coding Java as much as you like to eat " + dessert + ".\n");

        // Question 3: Work
        System.out.println("Where do you work?");
        String work = in.nextLine();
        System.out.println("I hope you like working at " + work + ".");
        System.out.println("I used to work as a programmer for autocorrect… Then they fried me for no raisin.\n");

        // Question 4: Dance
        System.out.println("What is your favorite dancing song?");
        String dance = in.nextLine();
        System.out.println(dance + " is a great song!");
        System.out.println("I don't have a favorite dancing song. I can't dance, I don't get the algo-rhythm...\n");

        // Question 5: Language
        System.out.println("What language do you speak?");
        String language = in.nextLine();
        System.out.println(language + " is an awesome language!");
        System.out.println("I know a little Spanish, but I know some programming languages like Sí++\n");

        // Close the Scanner Object
        in.close();
    }
}
