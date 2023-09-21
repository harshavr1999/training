var Shape ={
    name: "Square",
    say: function(){
        console.log("This is Say() : "+this.name);

        setTimeout(function(){
            console.log("Inside Timeout : "+this.name)
        },2000);
    }
}

Shape.say();