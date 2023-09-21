function removeCharacter(str, position) {
    var newString;
    newString = str.substring(0, position) + str.substring(position + 1, str.length);
    return newString;
}
console.log(removeCharacter("Harsha", 1));
