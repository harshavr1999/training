class Menu{
    items: Array<string>;
    pages: number;

    constructor(givenItems: Array<string>, givenPages: number){
        this.items=givenItems;
        this.pages=givenPages;
    }

    list(): void{
        console.log("Our Menu for Today");
        for(var i=0;i<this.items.length;i++){
            console.log(this.items[i]);
        }
        console.log("Page : "+this.pages);
    }

}

var sundayMenu = new Menu(["Pastry","Donuts","Coffee"],1);
sundayMenu.list();