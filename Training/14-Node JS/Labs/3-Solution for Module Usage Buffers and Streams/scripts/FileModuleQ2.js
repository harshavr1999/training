var fs = require('fs');
var file = 'Data.txt';

var http = require('http');
http.createServer(function (req, res) {

//Check permission
fs.access(file,fs.constants.R_OK | fs.constants.W_OK, (err) => {
    if (err) {
        res.write("File doesn't exist");
    } else {
        res.write("Can read and write the file");
    }
});

// Checking File exists or not
if (fs.existsSync(file)) {
  res.write("File exists");
} else {
  res.write("File Does not exist");
}


// Checking Directory exists or not
fs.access("../scripts", function(error) {
  if (error) {
    res.write("Directory does not exist.")
  } else {
    res.write("Directory exists.")
  }
})

res.end();
}).listen(3000);