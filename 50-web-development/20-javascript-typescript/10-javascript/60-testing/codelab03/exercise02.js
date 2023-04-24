/*
 * Inspect the tests of exercise02.spec.js to know how you should implement these methods!
 */

const ALIGNMENT = {
    CHAOTIC: 'Chaotic Alignment',
    NEUTRAL: 'Neutral Alignment',
    GOOD: 'Good Alignment'
};

class SuperHero {

    constructor(name, alignment) {
        this.name = name;
        this.alignment = alignment;
    }

    /* This method is already provided */
    speak() {
        return `I am ${this.name}`;
    }

}

