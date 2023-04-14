/*
You just made a new friend at school and he is trying to guess your birthday. He has already
guessed the month and year of your birth, and is now trying to guess the date d. Write a loop
to allow your friend to keep guessing until he guesses right. Stop once he has guessed
correctly. Print out “Incorrect Guess” if the guess is not correct, and “Correct Guess” if the
guess is correct.
 */

import java.util.Scanner;

public class BirthdayGuess {
    public static void main(String[] args) {
        guessBirthday(26,1993);
    }
    public static void guessBirthday(int month, int year) {
        Scanner input = new Scanner(System.in);
        int date;
        int day = 26;
        do {
            System.out.print("Guess the date of birth: ");
            date = input.nextInt();
            if (date != day) {
                System.out.println("Incorrect guess");
            }
        } while (date != day);
        System.out.println("Correct guess!");
    }
}
