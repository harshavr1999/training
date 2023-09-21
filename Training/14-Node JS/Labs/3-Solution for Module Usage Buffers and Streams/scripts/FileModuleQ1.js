var fs = require('fs');

// Listing Dirctory Contents
fs.readdir("D://", (err, fd) => {
    if (err) {
        throw err;
    }
    fd.forEach(function (fd) {
        console.log(fd);
    });
});

// copying usinf pipe
fs.createReadStream('Data.txt').pipe(fs.createWriteStream('NewFile.txt'));

// Reading data from file synchronously
const data = fs.readFileSync('Data.txt');
console.log(data.toLocaleString());