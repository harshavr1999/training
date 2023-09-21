var express = require('express');
var app = express();

app.get('/', function(req, res){
    res.send('<html> <body> <h1> Hello World </h1> </body> </html>');
});

var server = app.listen(3000, function(){
    console.log(' Node JS Server is Running ');
})