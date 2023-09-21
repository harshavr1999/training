var Menu = /** @class */ (function () {
    function Menu(givenItems, givenPages) {
        this.items = givenItems;
        this.pages = givenPages;
    }
    Menu.prototype.list = function () {
        console.log("Our Menu for Today");
        for (var i = 0; i < this.items.length; i++) {
            console.log(this.items[i]);
        }
        console.log("Page : " + this.pages);
    };
    return Menu;
}());
var sundayMenu = new Menu(["Pastry", "Donuts", "Coffee"], 1);
sundayMenu.list();
