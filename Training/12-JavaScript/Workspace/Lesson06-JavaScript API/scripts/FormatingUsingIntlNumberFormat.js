var givenNumber = new Number(10000000.43566);
console.log(givenNumber);

var numberFormat = Intl.NumberFormat("en-US",{
    style: "currency",
    currency: "USD",
    // currency: "INR",
    maximumFractionDigits:2
});

var convertedResult= numberFormat.format(givenNumber);
console.log(convertedResult);