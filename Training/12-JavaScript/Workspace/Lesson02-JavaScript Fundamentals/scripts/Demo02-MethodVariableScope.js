function declareVariable(){
    if(true){
        var x = "Declared with in a block of code";
    }
    //There is no block variable, here even it is in if block it is considered as method variable
    console.log("Value of x : "+x);
}

declareVariable();