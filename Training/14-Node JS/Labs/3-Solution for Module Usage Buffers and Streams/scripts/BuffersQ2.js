var http = require('http');

http.createServer(function(req,res){

    res.writeHead(200,{'content-type':'text/html'});
    var dobj = new Date();
    res.end("Hello , the current date is "+ dobj);
       
}).listen(3000);