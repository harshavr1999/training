function doSomething(givenValue){
    value=givenValue || "Default value";
    console.log(value);
}

doSomething();
doSomething(null);
doSomething("Hello");
doSomething(false);
doSomething(true);