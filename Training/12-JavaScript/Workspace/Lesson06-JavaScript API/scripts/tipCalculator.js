window.addEventListener("load",function(){
    var tipButtonElement = this.document.getElementById("tipButton");

    tipButtonElement.addEventListener("click",function(){
        var tipTotalBillElement = document.getElementById("tipTotalBill");
        var tipNumberOfPeopleElement = document.getElementById("tipNumberOfPeople");
        var tipOutputElement = document.getElementById("tipOutput");

        var billTextValue = tipTotalBillElement.value;
        var peopleTextvalue = tipNumberOfPeopleElement.value;

        var totalBill = parseFloat(billTextValue);
        var noOfPeople = parseInt(peopleTextvalue);

        var result="";
        if(isNaN(totalBill)){
            result="Enter the details pls...";
        }else{
            var amount =((totalBill+(totalBill*0.1)))/noOfPeople;
            result = ((amount)+" has to be paid by each one...");
        }

        tipOutputElement.innerHTML=result;
    })
})