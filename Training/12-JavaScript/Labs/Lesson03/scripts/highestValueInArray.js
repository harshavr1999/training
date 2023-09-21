function max(numbers) {
    if (toString.call(numbers) !== "[object Array]") {
        return false;
    }

    return Math.max.apply(null, numbers);
}

console.log(max([12, 34, 56, 1]));
console.log(max([-12, -34, 0, -56, -1]));
