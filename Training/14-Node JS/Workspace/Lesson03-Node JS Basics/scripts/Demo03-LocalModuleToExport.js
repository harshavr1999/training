var log={
    info: function(info){
        console.log("Info : "+ info);
    },
    warning: function(warn){
        console.log("Warning : "+ warn);
    },
    error: function(err){
        console.log("Error : "+ err);
    }
}

module.exports=log;