// Optional parameter
function Car(brand, cost) {
    return brand + " " + cost;
}
console.log(Car("BMW", 2000000));
console.log(Car("Audi"));
// Default parameter
function sum(num1, num2) {
    if (num2 === void 0) { num2 = 200; }
    return num1 + num2;
}
console.log(sum(100));
console.log(sum(100, 300));
