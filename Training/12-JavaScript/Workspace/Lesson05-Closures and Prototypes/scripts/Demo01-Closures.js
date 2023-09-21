function add(number1, number2){
    function doAdd(){
        return number1+number2;
    }

    return doAdd();

}

var result=add(23,26);
console.log(result);