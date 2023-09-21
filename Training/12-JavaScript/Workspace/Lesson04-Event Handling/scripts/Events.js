function showSpeakersBanner(){
    alert("You have clicked on section-1");
}

window.addEventListener("load",function(){
    var section2Element = this.document.getElementById("section-2");
    section2Element.addEventListener("click",function(){
        alert("You have clicked on section-2");
    },false);
})