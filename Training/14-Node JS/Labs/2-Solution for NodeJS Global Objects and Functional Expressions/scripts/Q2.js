var interval= setInterval(function(){
    console.log("Hey at every 1 sec");
},1000);

setTimeout(function(){
    clearInterval(interval);
},5000);