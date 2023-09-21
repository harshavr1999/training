var givenNumber = new Number(10000000.43566);
console.log(givenNumber);

var convertedResult = givenNumber.toLocaleString("en-US",{
    style: "currency",
    currency: "USD",
    // currency: "INR",
    maximumFractionDigits:2
});

console.log(convertedResult);