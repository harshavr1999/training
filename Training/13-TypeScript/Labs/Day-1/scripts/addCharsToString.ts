function addCharsToString(str: string): string {
    if (str.length >= 3) {
        var subString: string = str.substring(str.length - 3);
        return subString + str + subString;
    } else
        return "Enter string length greater than 3";
}
console.log(addCharsToString("Hello"));
console.log(addCharsToString("Hi"));

