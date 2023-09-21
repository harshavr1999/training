function actionperformed(){
    var articleElement = document.getElementById("article-1");

    //Add the paragraph element
    var headingElement = document.createElement("h2");
    var text = "This the new header text added to the article by document";

    //To indiacet the text is body content
    var newTextElement = document.createTextNode(text);

    // Add this to the heading element
    headingElement.appendChild(newTextElement);

    //Add to the article
    articleElement.appendChild(headingElement);
}