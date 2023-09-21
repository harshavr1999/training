interface Knife{
    usage:string;
}

interface BottleOpener{

}

interface ScrewDriver{

}

let SwissArmyKnife: Knife & BottleOpener & ScrewDriver ={
    usage: "jj",

}