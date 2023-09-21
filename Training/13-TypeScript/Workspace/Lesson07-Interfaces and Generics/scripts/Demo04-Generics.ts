// Without Generics
function retriveArray(items: any[]): any[]{
    return new Array().concat(items);
}

let myNumberArr = retriveArray([100,200,300,400]);

let myStringArr = retriveArray(["Harsha","Rahul","Tarun"]);

myNumberArr.push(500);
myStringArr.push("Koushik");

myNumberArr.push("Harsha");
myStringArr.push(22);

// With Generics
function retriveGenericArray<T>(items: T[]): T[]{
    return new Array().concat(items);
}

let myNumberArr1 = retriveGenericArray<number>([100,200,300,400]);

let myStringArr1 = retriveGenericArray<string>(["Harsha","Rahul","Tarun"]);

myNumberArr1.push(500);
myStringArr1.push("Koushik");

// myNumberArr1.push("Harsha"); // Errror because we specified generics
// myStringArr1.push(22); // Errror because we specified generics