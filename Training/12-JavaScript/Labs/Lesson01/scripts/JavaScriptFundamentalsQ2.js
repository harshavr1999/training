function Sum(x,y){
    var sum=0;
    if(x==y){
        sum=x*3;
    }else{
        sum=x+y;
    }
    return sum;
}

var result=Sum(5,5);
console.log(result);