var fs = require('fs');

// Changing the contents
const data = fs.readFileSync('DataWrite.txt');
dataString = data.toLocaleString();
const content = dataString.replace("Writing the content", 'Replaced content');
fs.writeFile('DataWrite.txt', content, (err, fd) => {
    if (err) {
        throw err;
    } else {
        console.log("Writing is Complete");
    }
});

//Deleting a file
fs.unlink('Data.txt',function(){
        console.log("Deletion is Complete");
});

