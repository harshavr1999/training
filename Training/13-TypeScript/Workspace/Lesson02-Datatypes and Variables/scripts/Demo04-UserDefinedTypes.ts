// Arrays in TS
var studentsScoresInMaths: number[] = [98,91,94,90];

var studentsScoresInMathsAnotherWay: Array<number> =[97,94,92,91];

// Tuple DataTypes [Includes two sets of values of different datatypes]
let a: [string,number];
a=["Rahul",98];

class Employee{
    emplId: number;
    empName: string;

    constructor(givenEmpId: number, givenEmpName: string){
        this.emplId=givenEmpId;
        this.empName=givenEmpName;
    }

    displayDetails(): void{
        console.log("Employee Details ");
        console.log("Emp ID    : "+this.emplId);
        console.log("Emp Name  : "+this.empName);
    }
}

interface Shape{
    draw(): any;
}

class Circle implements Shape{
    draw():any  {
        console.log("Drawing a circle...");
    }
}

enum Season{
    Summer, Autumn, Rainy, Winter
}

//let seasonEnumRef: Season;

console.log(Season.Summer);