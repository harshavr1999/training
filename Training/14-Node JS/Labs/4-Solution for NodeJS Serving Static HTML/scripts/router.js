const path = require('path');

const urlMapping = {
    '/': 'index.html',
    '/foo': 'foo.html'
}

function router(url){

    const cleanUrl = url.split('?')[0];

    if(urlMapping.hasOwnProperty(cleanUrl)){
        const filePath = urlMapping[cleanUrl];

        const fullPath = path.join(__dirname,'public',filePath);

        return filePath;
    }
    return null;
}

module.exports = router;