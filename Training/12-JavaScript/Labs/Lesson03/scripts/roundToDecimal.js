function precise_round(number, round) {
    var value = Math.floor(number).toString();

    if (typeof number !== 'number' || typeof round !== 'number') {
        return 'Not a Number';
    }

    if (value[0] == '-' || value[0] == '+') {
        value = value.slice(value[1], value.length);
    }

    return number.toPrecision(value.length + round);
}
console.log(precise_round(12.375, 2));
console.log(precise_round(12.37499, 2));
console.log(precise_round(-10.3079499, 3));

