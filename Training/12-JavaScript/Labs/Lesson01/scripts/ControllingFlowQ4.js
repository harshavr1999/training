function Average(davidMarks,vinothMarks, divyaMarks, ishithaMarks, thomasMarks){
    var average = (davidMarks + vinothMarks + divyaMarks + ishithaMarks+ thomasMarks) / 5;
    return average;
}

var average = Average(80,77,88,95,68);

if(average<60){
    grade = "F";
}else if(average>60 && average<70){
    grade="D";
}else if(average>70 && average<80){
    grade="C";
}else if(average>80 && average<90){
    grade = "B";
}else if(average>90 && average<100){
    grade = "A";
}
console.log("Grade : "+grade);