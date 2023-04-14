/*
Write a program using loop to print the letters of the word "VENTURES" with two letters in
one line.
 */

function printTwoLettersPerLine(word) {
    for (let i = 0; i < word.length; i +=2 ) {
        console.log(word.charAt(i) + word.charAt(i+1));
    }
}

printTwoLettersPerLine("VENTURES");
