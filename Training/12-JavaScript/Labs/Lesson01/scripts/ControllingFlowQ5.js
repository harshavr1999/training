function happyNumber(number) {
    var sum, digit;
    var arr = [];

    while (number != 1 && arr[number] !== true) {
        arr[number] = true;
        sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum += digit * digit;
            number = (number - digit) / 10;
        }
        number = sum;
    }
    return (number == 1);
}

var count = 1;
var number = 1;
var result = '';
while (count < 6) {
    while (!happyNumber(number)) {
        number++;
    }
    result = result + (number + ", ");

    number++;
    count++;
}

console.log('First 5 happy numbers are : ' + result);



