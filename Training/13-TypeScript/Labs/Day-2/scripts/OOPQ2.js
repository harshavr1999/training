var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Employee = /** @class */ (function () {
    function Employee(givenEmpNo, givenName, givenSalary) {
        this.empNo = givenEmpNo;
        this.name = givenName;
        this.salary = givenSalary;
        this.bonus = givenSalary * 0.1;
    }
    Employee.prototype.getEmpNo = function () {
        return this.empNo;
    };
    Employee.prototype.setEmpNo = function (empNo) {
        this.empNo = empNo;
    };
    Employee.prototype.getName = function () {
        return this.name;
    };
    Employee.prototype.setName = function (name) {
        this.name = name;
    };
    Employee.prototype.getSalary = function () {
        return this.salary;
    };
    Employee.prototype.setSalary = function (salary) {
        this.salary = salary;
    };
    Employee.prototype.getBonus = function () {
        return this.bonus;
    };
    Employee.prototype.setBonus = function (bonus) {
        this.bonus = bonus;
    };
    Employee.prototype.toString = function () {
        return "Employee Details [Emp No : ".concat(this.empNo, "  Emp Name : ").concat(this.name, "  \n        Salary : ").concat(this.salary, "  Bonus : ").concat(this.bonus, "]");
    };
    return Employee;
}());
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(givenEmpNo, givenName, givenSalary, givenNoOfReportees) {
        var _this = _super.call(this, givenEmpNo, givenName, givenSalary) || this;
        _this.noOfReportees = givenNoOfReportees;
        return _this;
    }
    Manager.prototype.getNoOfReportees = function () {
        return this.noOfReportees;
    };
    Manager.prototype.setNoOfReportees = function (noOfReportees) {
        this.noOfReportees = noOfReportees;
    };
    Manager.prototype.toString = function () {
        return "Employee Details [Emp No : ".concat(this.empNo, "  Emp Name : ").concat(this.name, "  \n            Salary : ").concat(this.salary, "  Bonus : ").concat(this.bonus, " No of Reportees : ").concat(this.noOfReportees, "]");
    };
    return Manager;
}(Employee));
var man = new Manager(1, "Harsha", 20000, 22);
console.log(man.toString());
