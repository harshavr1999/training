interface Shape{
    draw();
    erase();
    describe();
}

class Circle implements Shape{
    draw() {
        console.log("Drawing a Circle...");
    }
    erase() {
        console.log("Erasing a Circle...");
    }
    describe() {
        console.log(" The Shape is Circle");
    }
}