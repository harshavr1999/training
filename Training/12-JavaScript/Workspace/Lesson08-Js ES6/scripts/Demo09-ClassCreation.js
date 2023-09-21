class Movie{
    constructor(givenId, givenTitle, givenRating){
        // Declare and initialize the instance variables
        this.id=givenId;
        this.title=givenTitle;
        this.rating=givenRating;
    }

    displayDetails(){
        console.log("Movie Details ");
        console.log("Id     : "+this.id);
        console.log("Title  : "+this.title);
        console.log("Rating : "+this.rating);
    }
}

var mov1Ref = new Movie(1001, "Vikram", "Good");
mov1Ref.displayDetails();

var mov2Ref = new Movie();
mov2Ref.displayDetails();

var mov3Ref= new Movie(mov1Ref);
mov3Ref.displayDetails();