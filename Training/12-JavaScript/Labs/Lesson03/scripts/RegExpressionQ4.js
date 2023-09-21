function convertNum(number) {
  var num = number.toString().split(".");
  num[0] = num[0].replace(/\B(?=(\d{3})+(?!\d))/g, ",");
  return num.join(".");
}

console.log(convertNum(10000));
console.log(convertNum(146700));
console.log(convertNum(55550.134));
