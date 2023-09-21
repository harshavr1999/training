// Alias
type animalType = string;
let animalName: animalType ="Lion";
console.log("Animal : "+animalName);

// Union
function animal(animalName: string | boolean){
    if(typeof animalName==="string"){
        return "Animal : "+animalName;
    }else if(typeof animalName==="boolean" && animalName==true){
        return "It is an animal";
    }else{
        return "Not an animal";
    }
}

console.log(animal(false));

// Enum

