function alphabeticalSort(word) {
    var letters=word.split('')
    var sortedletters=letters.sort()
    var sortedWord=sortedletters.join('');
    return sortedWord;
}
console.log(alphabeticalSort("hellozzxywabc"));
