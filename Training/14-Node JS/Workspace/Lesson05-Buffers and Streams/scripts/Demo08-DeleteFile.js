var fs = require('fs');

fs.unlink('Data1.txt',function(){
        console.log("Deletion is Complete");
});