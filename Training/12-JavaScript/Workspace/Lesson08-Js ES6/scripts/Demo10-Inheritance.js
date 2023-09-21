class InventoryItem{
    constructor(givenCondition, givenPrice){
        this.condition=givenCondition;
        this.price=givenPrice;
    }
    sayHello(){
        console.log("Hello from Inventory Item")
    }
}

class Movie extends InventoryItem{
    constructor(givenId, givenTitle, givenRating, givenCondition, givenPrice){
        // Declare and initialize the instance variables
        super(givenCondition,givenPrice);
        this.id=givenId;
        this.title=givenTitle;
        this.rating=givenRating;
        
    }

    displayDetails(){
        console.log("Movie Details ");
        console.log("Id        : "+this.id);
        console.log("Title     : "+this.title);
        console.log("Rating    : "+this.rating);
        console.log("Condition : "+this.condition);
        console.log("Price     : "+this.price);
    }

    sayHello(){
        console.log("Hello from Movie...")
    }
}

var mov1Ref = new Movie(1001, "Vikram", "Good","Available","Paid subscription");
mov1Ref.displayDetails();
mov1Ref.sayHello();

