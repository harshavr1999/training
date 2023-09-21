var array_Clone = function (numArray) {
    return numArray.slice(0);
};

console.log(array_Clone([1, 2, 4, 0]));
console.log(array_Clone([1, 2, [4, 0]]));
