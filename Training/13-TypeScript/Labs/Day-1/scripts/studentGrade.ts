function Grade(marks1: number, marks2: number, marks3: number, marks4: number, typeOfExam: string): boolean {
    var average: number = (marks1 + marks2 + marks3 + marks4) / 4;
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
;
console.log(Grade(85, 90, 95,90, "FinalExam"));