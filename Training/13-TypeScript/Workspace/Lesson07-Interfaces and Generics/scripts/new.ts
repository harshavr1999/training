
// var toppings: Array<string> = ['cheese', 'Ham', 'Bita', 'Tomatoes'];

// var makePizza = function(toppings: Array<string>) {
//     var pizza = ""
//     for (var i = 0; i < toppings.length; i++) {
//       pizza = pizza + toppings[i];
//       if (i < toppings.length - 1) {
//         pizza += " and ";
//       }
//     }
//     return "A tasty pizza with "+pizza;
//   }
// console.log(makePizza(toppings) );

interface a{
  var1: string;
}
interface b{
  var2: string;
}

function fun1(para1:a):void{
  console.log("inside fun1"+ para1);
}

function fun2(para2:b):void{
  console.log("inside fun2"+ para2);
}

var obj={var1: "for a", var2:"for b"};
fun1(obj);
fun2(obj);
