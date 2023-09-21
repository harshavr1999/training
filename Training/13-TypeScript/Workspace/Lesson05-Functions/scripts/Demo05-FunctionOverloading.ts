function add(val1: string, val2: string): string;

function add(val1: number, val2: number): number;

function add(a: any, b: any): any{
    return a+b;
}

console.log(add("Hello ","Everyone"));
console.log(add(20,30));