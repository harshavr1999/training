function convertString(str) {
    if (str.length >= 3) {
        const subString = str.subString(0,3).toLowerCase();
        const leftString = str.subString(3);
        return subString + leftString;
    }
    else{
        return str.toUppercase();
    }
}

console.log("Harsha");
