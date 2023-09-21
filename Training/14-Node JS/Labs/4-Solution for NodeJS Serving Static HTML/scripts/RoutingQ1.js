var http = require('http');

var server = http.createServer(function(req,res){

    if(req.url=='/'){
        res.writeHead(200,{'Content-type':'text/html'});
        res.write('<html><body><h2>Hello from Index Page</h2></body></html>');
        res.end();
    }else if(req.url=='/foo'){
        res.writeHead(200,{'Content-type':'text/html'});
        res.write('<html><body><h2>Hi from Foo Page</h2></body></html>');
        res.end();
    }else{
        res.end('Invalid Request !');
    }
})
server.listen(3000);
console.log("Server Started and Listening on Port 3000 ");