// Optional parameter
function Car(brand: string, cost?: number): string{
    return brand +" "+ cost;
}

console.log(Car("BMW",2000000));
console.log(Car("Audi"));

// Default parameter
function sum(num1: number, num2: number=200): number{
    return num1+num2;
}

console.log(sum(100));
console.log(sum(100,300));

// Function taking function as parameter
