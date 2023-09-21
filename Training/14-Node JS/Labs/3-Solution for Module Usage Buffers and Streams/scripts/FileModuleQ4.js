var fs = require('fs');

fs.writeFile('DataWrite.txt',"Hello Everyone Writing the content",(err,fd)=>{
    if(err){
        throw err;
    }else{
        console.log("Writing is Complete");
    }
});