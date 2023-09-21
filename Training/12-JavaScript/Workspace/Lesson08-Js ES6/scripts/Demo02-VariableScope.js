function declareVariable(){
    if(true){
        var x= "Declared in the if block";
        let y = "Declared in the if block"
    }
    console.log(x);// Can be accessed because its not a block variable, it is a method variable

    //console.log(y);// Can't be accessed becaused here it is a block variable
}

declareVariable();