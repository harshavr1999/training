var side1: number = 5;
var side2: number = 6;
var side3: number = 7;

var s:number = (side1+side2+side3)/2;
var area:number;

area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

console.log("Area of traingle : "+area);