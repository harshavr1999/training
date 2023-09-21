class Employee {
    private bonus: number;

    constructor(private empNo: number, private empName: string, private salary: number) {
        this.bonus = salary * 0.1;
    }

    // This Function Shows a new syntax with databinding concept
    displayDetails() {
        return `Employee Details [Emp No : ${this.empNo}  Emp Name : ${this.empName}  
            Salary : ${this.salary}  Bonus : ${this.bonus}]`;

    }

}

var empRef1 = new Employee(1001,"Harsha",10000);
console.log(empRef1.displayDetails());

var empRef2 = new Employee(1002, "Rahul",15000);
empRef2.displayDetails();