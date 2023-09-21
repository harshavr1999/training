class Employee{
    readonly empNo: number;
    empName: string;

    constructor(givenEmpNo: number, givenEmpName: string){
        this.empNo=givenEmpNo;
        this.empName=givenEmpName;
    }

}

let empref1 = new Employee(1001, "harsha");
// empref1.empNo = 1002; // Error because empNo is readonly
empref1.empName="Harsha";

interface MovieDetails{
    readonly movId: number;
    title: string;
    rating: string;
}

let movRef1: Movie={
    movId:1,
    title:"Vikram",
    rating:"Super"
}