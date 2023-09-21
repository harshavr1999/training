var animalName = "Lion";
console.log("Animal : " + animalName);
// Union
function animal(animalName) {
    if (typeof animalName === "string") {
        return "Animal : " + animalName;
    }
    else if (typeof animalName === "boolean" && animalName == true) {
        return "It is an animal";
    }
    else {
        return "Not an animal";
    }
}
console.log(animal(false));
// Enum
