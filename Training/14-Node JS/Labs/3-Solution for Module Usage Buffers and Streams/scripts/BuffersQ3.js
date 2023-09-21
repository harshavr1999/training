var fs = require('fs');
fs.readFile('Data.txt',(err,fd)=>{
    if(err){
        throw err;
    }
    else {
        console.log(fd.toLocaleString());
    }
});