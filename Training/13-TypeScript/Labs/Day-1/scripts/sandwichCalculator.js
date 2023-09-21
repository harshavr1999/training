function sandwichCalculator(slicesOdBread, slicesOfCheese) {
    if (slicesOdBread / 2 > slicesOfCheese) {
        return slicesOfCheese;
    }
    else {
        return slicesOdBread / 2;
    }
}
console.log(sandwichCalculator(10, 1));
console.log(sandwichCalculator(10, 5));
