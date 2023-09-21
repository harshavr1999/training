var fs = require('fs');

const data = fs.readFileSync('Data.txt');
dataString = data.toLocaleString();
splitString = dataString.split("\n"); 
console.log(splitString.length);