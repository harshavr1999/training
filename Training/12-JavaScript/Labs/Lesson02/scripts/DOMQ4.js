var boldWords = document.getElementsByTagName('b');
function highlightWords() {
    for (var i = 0; i < boldWords.length; i++) {
        boldWords[i].style.color = "brown";
    }
}
function changeBack() {
    for (var i = 0; i < boldWords.length; i++) {
        boldWords[i].style.color = "black";
    }
}