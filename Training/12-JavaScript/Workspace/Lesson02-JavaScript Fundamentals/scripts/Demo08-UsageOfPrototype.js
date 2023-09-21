function Movie(givenId, givenTitle, givenRating){
    //We are declaring instance variable and initialized
    this.id=givenId;
    this.title=givenTitle;
    this.rating=givenRating;
}

Movie.prototype.displayDetails= function(){
    console.log("Movie Details :");
    console.log("ID     : "+this.id);
    console.log("Title  : "+this.title);
    console.log("Rating : "+this.rating);
}

var mov1=new Movie(1001, "Vikram", "Good");
mov1.displayDetails();
console.log();
var mov2=new Movie(1002, "Jersey", "Excellent");
mov2.displayDetails();

