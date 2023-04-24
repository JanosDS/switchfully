function firstLetter(word?: string): string {
    return word?.charAt(0) ?? 'Nothing';
}

console.log(firstLetter('Bob'));
console.log(firstLetter());
