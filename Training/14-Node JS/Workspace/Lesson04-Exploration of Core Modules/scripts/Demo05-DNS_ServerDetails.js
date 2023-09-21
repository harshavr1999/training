const dns = require('dns');
dns.lookup('www.oracle.com',(err, addresses, family) => {
    console.log('addresses : ',addresses);
    console.log('family : ',family);
})