interface Movie{
    movId: number;
    title: string;
    rating: string;
}

// Object Construction with Strict Norms
let mov1: Movie ={
    movId: 1001,
    title: "Vikram",
    rating: "Worth Watching"
};

// let mov2: Movie ={
//     movId: 1001,
//     title: "Vikram", // Problem because missing attribute
// };

// let mov3: Movie ={
//     movId: 1001,
//     title: "Vikram",
//     rating: 123 // Error because attribute type mismatch
// };
