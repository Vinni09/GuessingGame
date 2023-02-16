package org.guess.game;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the guessing game!");
        System.out.println("Please choose your user name!");

        Scanner answers = new Scanner(System.in);
        String name = answers.next();

        System.out.println("Hello " + name + ". Do you want to play a game?");
        System.out.println("\t Yes");
        System.out.println("\t No");

        String inputText = answers.next();

        while(!Objects.equals(inputText, "Yes")){
            System.out.println("Hello " + name + ". Do you want to play a game?");
            System.out.println("\t - Yes");
            System.out.println("\t - No");
            inputText = answers.next();
        }

        if(Objects.equals(inputText, "Yes")){
            System.out.println("Ok lets begin.");
        }

        Random random = new Random();
        int randomNumber = random.nextInt(20)+1;
        System.out.println("Guess a number between 1 and 20.");

        for(int i=1; i<=5; i++){

            int inputNumber = answers.nextInt();

            if(randomNumber < inputNumber && i < 5){
                System.out.println("Try again with a lower number!");
            } else if(randomNumber > inputNumber && i < 5){
                System.out.println("Try again with a greater number!");
            } else if(inputNumber == randomNumber){
                System.out.println("Congratulations " + name + ", you won! You needed " + i + " tries!");
                i = 5;
            } else {
                System.out.println("Game Over!");
                System.out.println("The number was " + randomNumber + ".");
            }

        }

    }

}
