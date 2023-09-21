function perfectNum(number) {
    var sum = 0;
    for (var i = 0; i < number; i++) {
        if (number % i == 0) {
            sum = sum + i;
        }
    }
    if(sum==number){
        console.log(number+" is a perfect number");
    }else{
        console.log(number+" is not a perfect number")
    }
}

perfectNum(28);