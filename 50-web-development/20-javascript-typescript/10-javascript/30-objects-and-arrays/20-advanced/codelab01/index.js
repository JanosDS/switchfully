function countNonVowels(word) {
    word = word.replaceAll(/[aeuioAEUIO]/g, '');
    console.log(word);
    return word.length;
}

let wordToCount = "Freddy";
console.log(countNonVowels(wordToCount));