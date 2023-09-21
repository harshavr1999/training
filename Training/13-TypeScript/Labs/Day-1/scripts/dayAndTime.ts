var date = new Date();
var day: number = date.getDay();

var weekdays: Array<string> = ['Sunday', 'Monday', 'Tuesday','Wednesday', 'Thursday', 'Friday', 'Saturday'];
console.log("Today is : " + weekdays[day])

var hours = date.getHours();
var ampm: string = hours >= 12 ? "PM" : "AM";
hours = (hours >= 12)? hours - 12: hours;

var minutes: string | number = date.getMinutes();
minutes = minutes < 10 ? '0' + minutes : minutes;
var time = hours + " " + ampm + " : " + minutes + " : " + date.getSeconds();
console.log("Current time is : " + time);