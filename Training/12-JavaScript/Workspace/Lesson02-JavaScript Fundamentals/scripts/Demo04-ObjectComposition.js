var myObject={
    name: "Ring",
    diameter: 12,

    // Object Declaration within another object (Composition)
    specs:{
        material: "Wood",
        waterProof: false
    }
};

//Heterogeneous Arrays
var myArray =["one", "Two", 3, "Four", 5, 6];

//Accessing objects using different ways
console.log("Accessing via DOT Operator");
console.log(myObject.name+"\t"+myObject.diameter+"\t"+myObject.specs.material);

console.log("Accessing via OFF Operator");
console.log(myObject["name"]+"\t"+myObject["diameter"]+"\t"+myObject["specs"]["material"]);

// Showing Arrays with Dynamicness
console.log(myArray[0]);
console.log(myArray.length);
// myArray[7]="Seven";
// If we add an element then the length will be increased 
console.log(myArray[20]);
// in the above we just accessing it not defining so the length will remain same
console.log(myArray.length);