function displayDetails(){
    console.log("Movie Details :");
    console.log("ID     : "+this.id);
    console.log("Title  : "+this.title);
    console.log("Rating : "+this.rating);
}


// We are creating a class by the name movie
function Movie(givenId, givenTitle, givenRating){
    //We are declaring instance variable and initialized
    this.id=givenId;
    this.title=givenTitle;
    this.rating=givenRating;

    //Associating Funcyions with a class
    this.displayDetails=displayDetails;
}

var mov1=new Movie(1001, "Vikram", "Good");
mov1.displayDetails();

var mov2=new Movie(1002, "Jersey", "Excellent");
mov2.displayDetails();
