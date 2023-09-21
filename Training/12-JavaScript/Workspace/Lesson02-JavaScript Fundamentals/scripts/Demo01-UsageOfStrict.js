function findPrice(){
    // without Strict
    // price=5000; // variable in this case it is auto declared
    // console.log("Price : "+price);

    // Usage of Strict
    'use strict';
    price=5000; //Variable in this case is not auto declared
    console.log("Price : "+price);
}

findPrice();