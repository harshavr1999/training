window.addEventListener("load",function(){
    var ageButtonElement = document.getElementById("ageButton");
    //Registering the event on button click
    ageButtonElement.addEventListener("click",function(){
        var ageInputElement = document.getElementById("ageInput");
        var ageOutputElement = document.getElementById("ageOutput");
        var ageTextValue = ageInputElement.value;
        
         // anything in input field is string
        var age = parseInt(ageTextValue,10);

        var result="";
        if(isNaN(age)){
            result="Input a number pls...";
        }else{
            result=((100-age)+" Years before you turn 100 years..");
        }

        console.log(result);
        ageOutputElement.innerHTML=result;

    });
})