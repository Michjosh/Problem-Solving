function guessBirthday(month, year) {
    let correctDate = new Date(year, month - 1).getDate();
    let guess;

    do {
        guess = prompt("Guess the date of my birthday (1-31):");

        if (guess === correctDate) {
            console.log("Correct Guess!");
            return;
        } else {
            console.log("Incorrect Guess.");
        }
    } while (guess !== correctDate);
}

guessBirthday(4, 1995); // Example usage: guesses April 1995
