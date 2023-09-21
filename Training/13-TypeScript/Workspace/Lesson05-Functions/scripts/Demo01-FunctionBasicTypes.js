// Named Functions
// Without Parameters and without return types
function sayHello() {
    console.log("Hello from without parameters and without return types");
}
// With parameters and with return type
function welcomeAll(givenName) {
    return "Hi, " + givenName + " from with parameters and with return type";
}
sayHello();
console.log(welcomeAll("Harsha"));
// Anonymus Functions
// Without Parameters and without return types
var callHello = function () {
    console.log("Hello from without parameters and without return types");
};
// With parameters and with return type
var callAll = function (givenName) {
    return "Hi, " + givenName + " from with parameters and with return type";
};
callHello();
console.log(callAll("Harsha"));
