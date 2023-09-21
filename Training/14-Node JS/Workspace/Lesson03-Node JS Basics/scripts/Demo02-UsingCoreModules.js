var http = require('http');
// import {http} from 'http';

var server = http.createServer(function(req,res){
    res.writeHead(200,{'Content-Type' : 'text/html'});
    res.end("Hello From Server ...");
});
server.listen(7777);

