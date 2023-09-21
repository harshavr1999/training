let addtion =(...args) => {
    var sum=0;
    for(let i of args){
        sum+=i;
    }
    console.log("Result : "+sum);
}

addtion(10,20,30,40,50);