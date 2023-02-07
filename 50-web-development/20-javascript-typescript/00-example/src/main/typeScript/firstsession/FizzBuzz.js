function fizzBuzz(amount, callBack) {
    var result = [];
    function convertToFizzBuzz(number) {
        if (number % 15 === 0) {
            return 'FizzBuzz';
        }
        if (number % 3 === 0) {
            return 'Fizz';
        }
        if (number % 5 === 0) {
            return 'Buzz';
        }
        return number;
    }
    for (var number = 1; number < amount + 1; number++) {
        var fizzBuzzNumber = convertToFizzBuzz(number);
        result.push();
    }
    callBack(result);
}
fizzBuzz(15, function (list) {
    console.log(list);
});
