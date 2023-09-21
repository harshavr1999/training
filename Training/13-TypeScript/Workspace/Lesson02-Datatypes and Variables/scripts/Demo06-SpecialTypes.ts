// Union
let result: number | string;
result=10;
result="Hi";
// result=false;

function add(a: number | string, b: number | string){
    if(typeof a === 'number' && typeof b === 'number'){
        return a+b;
    }else if(typeof a === 'string' && typeof b === 'string'){
        return a.concat(b);
    }else{
        throw new Error("Parameters must be numbers or strings");
    }
}

// Intersection

interface Person{
    name: string;
    age: number;
};

interface Student{
    studentCode: string;
    division: string;
};

let student: Student & Person ={
    studentCode: "1",
    division: "10",
    name: "Rahul",
    age: 23
};

