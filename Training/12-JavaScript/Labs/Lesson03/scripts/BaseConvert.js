function baseConvert(number, initialBase, reqBase) {
    if ((initialBase && reqBase) < 2 || (initialBase && reqBase) > 36)
        return "Base value should be between 2 and 36";

    return parseInt(number + '', initialBase).toString(reqBase);
}

console.log(baseConvert('E164', 16, 8));
console.log(baseConvert(1000, 2, 8));
