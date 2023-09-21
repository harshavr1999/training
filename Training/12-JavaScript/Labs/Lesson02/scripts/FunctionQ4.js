function firstRepeatedLetter(str) {
    var letterArray = str.split('');
    var result = '';
    var count = 0;
    for (var i = 0; i < letterArray.length; i++) {
        count = 0;
        for (var j = 0; j < letterArray.length; j++) {
            if (letterArray[i] === letterArray[j]) {
                count += 1;
            }
        }
        if (count < 2) {
            result = letterArray[i];
            break;
        }
    }
    return result;
}
console.log(firstRepeatedLetter('abacddbec'));
