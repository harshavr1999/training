function Sum(x, y) {
    var sum;
    if (x == y) {
        sum = x * 3;
    }
    else {
        sum = x + y;
    }
    return sum;
}
var result = Sum(5, 2);
console.log(result);
