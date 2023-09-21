function InventoryItem(givenCondition, givenPrice){
    this.codition=givenCondition;
    this.price=givenPrice;
}

InventoryItem.prototype.sayHello=function(){
    console.log("Hello from Inventory item");
}

function Movie(){

}

// This is how we use inheritance in tradition javascript
Movie.prototype=new InventoryItem();

var mov1=new Movie();
mov1.sayHello();