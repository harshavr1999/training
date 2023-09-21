function Grade(marks1, marks2, marks3, marks4, typeOfExam) {
    var average = (marks1 + marks2 + marks3 + marks4) / 4;
    if (typeOfExam == "FinalExam") {
        if (average >= 90){
            return true;
        }else{
            return false;
        }        
    }else {
        if (average >= 89){
            return true;
        }else{
            return false;
        }        
    }
}
var result = Grade(85, 90, 95,90, "FinalExam");
console.log(result);