function num50(num1,num2){
    if (num1==50||num2==50){
        return true;
    }else if(num1+num2==50){
        return true;
    }else {
        return false;
    }
}
console.log(num50(50,20));
console.log(num50(20,30));
console.log(num50(20,40));

