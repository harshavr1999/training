var student={
    name:"David Rayy",
    sclass: "VI",
    rollno:12
};
console.log("Before deleting the rollno")
console.log(student);

delete student.rollno;
console.log("After deleting rollno");
console.log(student);