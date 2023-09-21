const router = require('./router');

const url = '/foo';
const filePath  = router(url);
if(filePath){

    console.log(filePath);
}
else {
    console.log("file not found");
}