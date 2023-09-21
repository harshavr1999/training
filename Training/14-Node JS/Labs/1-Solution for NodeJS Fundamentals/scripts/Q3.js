function convertTempCtoF(celsius){
    var fahrenheit = (9*celsius + 160)/5;
    console.log(`${celsius}C is ${fahrenheit}F`);
}

function convertTempFToC(fahrenheit){
    var celsius = (5*fahrenheit - 160)/9;
    console.log(`${fahrenheit}F is ${celsius}C`);
}

convertTempCtoF(60);
convertTempFToC(45);
