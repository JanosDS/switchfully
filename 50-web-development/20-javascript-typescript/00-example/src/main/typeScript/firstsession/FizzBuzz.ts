function fizzBuzz(amount: number, callBack: (list: string[]) => void): void {
    const result: string[] = [];

    function convertToFizzBuzz(number: number) {

        if (number % 15 === 0) {
            return 'FizzBuzz';
        }
        if (number % 3 === 0) {
            return 'Fizz';
        }
        if (number % 5 === 0) {
            return 'Buzz';
        }
        return ((number as unknown) as string);
    }

    for (let number: number = 1; number < amount + 1; number++) {
        let fizzBuzzNumber = convertToFizzBuzz(number);
        result.push();
    }

    callBack(result);
}

fizzBuzz(15, function (list: string[]): void {
    console.log(list);
});



