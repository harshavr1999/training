function greet(greeting: string, name?: string):string{
    return greeting+" "+name;
}

console.log(greet("Hello"));
console.log(greet("Hi","Harsha"));