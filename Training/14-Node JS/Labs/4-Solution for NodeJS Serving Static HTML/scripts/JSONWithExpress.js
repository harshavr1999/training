var express = require('express');
var app = express();

app.get('/', function(req, res){
    res.json({message: "Hello"});
    res.end();
});

var server = app.listen(5000, function(){
    console.log(' Node JS Server is Running ');
})