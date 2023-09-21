// var target=document.getElementById("movie-details");
// alert(target.nodeName);

// var artistList=document.getElementsByTagName("li");

// for(var i=0;i<artistList.length;i++){
//     alert(artistList[i].nodeName+"\t"+artistList[i].textContent);
// }

// Finding the parent
// var vikram = document.getElementById("vikram-2022");
// var sectionElement = vikram.parentNode;
// alert(sectionElement.nodeName);

//finding the child Nodes
// var artists = document.getElementById("artist-list");
// //here childnodes are going like 1,3,5,7,9....
// var vijaySethupathiElement = artists.childNodes[5];
// alert(vijaySethupathiElement.textContent)

//Reading Attribute Values
var anchorElement = document.getElementById("vikram-2022");
alert(anchorElement.getAttribute("href"));