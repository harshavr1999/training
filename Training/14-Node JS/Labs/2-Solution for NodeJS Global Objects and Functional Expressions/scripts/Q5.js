// Hostname
const url=require('url');
const myURL = new URL('https://www.google.co.in:7777/abc/harsha_123');
console.log("Hostname : "+myURL.hostname);

// Pathname
console.log("Pathname : "+myURL.pathname);

//Portnumber
console.log("PortNumber : "+myURL.port);

// Protocol
console.log("Protocal : "+myURL.protocol);

// convert url's to JSON
const myURLs =[
    new URL('https://www.google.com'),
    new URL('https://www.youtube.com'),
];

console.log(JSON.stringify(myURLs));