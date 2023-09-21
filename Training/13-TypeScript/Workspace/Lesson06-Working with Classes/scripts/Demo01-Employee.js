var Employee = /** @class */ (function () {
    function Employee(empNo, empName, salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
        this.bonus = salary * 0.1;
    }
    // This Function Shows a new syntax with databinding concept
    Employee.prototype.displayDetails = function () {
        return "Employee Details [Emp No : ".concat(this.empNo, "  Emp Name : ").concat(this.empName, "  \n            Salary : ").concat(this.salary, "  Bonus : ").concat(this.bonus, "]");
    };
    return Employee;
}());
var empRef1 = new Employee(1001, "Harsha", 10000);
console.log(empRef1.displayDetails());
var empRef2 = new Employee(1002, "Rahul", 15000);
empRef2.displayDetails();
