class Employee{
   protected empNo: number;
   protected name: string;
   protected salary: string;
   protected bonus: number;

    public getEmpNo(): number {
        return this.empNo;
    }

    public setEmpNo(empNo: number): void {
        this.empNo = empNo;
    }

    public getName(): string {
        return this.name;
    }

    public setName(name: string): void {
        this.name = name;
    }

    public getSalary(): string {
        return this.salary;
    }

    public setSalary(salary: string): void {
        this.salary = salary;
    }

    public getBonus(): number {
        return this.bonus;
    }

    public setBonus(bonus: number): void {
        this.bonus = bonus;
    }

   constructor(givenEmpNo,givenName, givenSalary){
    this.empNo = givenEmpNo;
    this.name = givenName;
    this.salary = givenSalary;
    this.bonus = givenSalary*0.1;
   }

   public toString(): string{
    return `Employee Details [Emp No : ${this.empNo}  Emp Name : ${this.name}  
        Salary : ${this.salary}  Bonus : ${this.bonus}]`;
   }
}

class Manager extends Employee{
    private noOfReportees: number;

    public getNoOfReportees(): number {
        return this.noOfReportees;
    }

    public setNoOfReportees(noOfReportees: number): void {
        this.noOfReportees = noOfReportees;
    }

    
    constructor(givenEmpNo,givenName, givenSalary,givenNoOfReportees){
        super(givenEmpNo,givenName, givenSalary);
        this.noOfReportees=givenNoOfReportees;
    }

    public toString(): string{
        return `Employee Details [Emp No : ${this.empNo}  Emp Name : ${this.name}  
            Salary : ${this.salary}  Bonus : ${this.bonus} No of Reportees : ${this.noOfReportees}]`;
       }

}

var man = new Manager(1,"Harsha",20000, 22);
console.log(man.toString());