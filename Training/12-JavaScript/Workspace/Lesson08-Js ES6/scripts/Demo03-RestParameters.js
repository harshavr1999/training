function doAdd(...args){
    let sum=0;
    for(let i of args){
        sum+=i;
    }
    console.log("Sum : "+sum);
}

doAdd(10,20);
doAdd(10,20,30);
doAdd(10,20,30,40,50,60);
