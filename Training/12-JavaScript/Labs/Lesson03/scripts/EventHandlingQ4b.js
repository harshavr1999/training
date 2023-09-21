window.addEventListener("load",function(){
    var addButtonElement = document.getElementById("addButton");
    addButtonElement.addEventListener("click",function(){
        var num1Element=document.getElementById("number1");
        var num2Element=document.getElementById("number2");
        var addOutputElement = document.getElementById("addOutput");

        var num1Value = num1Element.value;
        var num2Value = num2Element.value;

        var num1=parseInt(num1Value);
        var num2=parseInt(num2Value);

        var result="";
        if(isNaN(num1)&&isNaN(num2)){
            result="Enter the numbers ....";
        }else{
            var sum=num1+num2;
            result="The sum of two numbers is : "+(sum);
        }

        addOutputElement.innerHTML=result;
        alert(result);
        
    })
})