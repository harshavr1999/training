
//Arrays
var courses =["JavaScript", "TypeSCript", "NodeJS", "React", "Angular"];
var students = [10, 14, 12, 23, 17, 26];

//Singleton Object
var course = {
    name: "JavaScript Essentials",
    students: 9,
    frequency: "Daily"
};

// Accessing Array Elements
console.log(courses[0]+" "+students[0]+"\t"+courses[3]+"\t"+students[3]);
// console.log(courses);

// Accessing the object attributes
console.log("Course Details");
console.log(course.name+"\t"+course.students+"\t"+course.frequency);