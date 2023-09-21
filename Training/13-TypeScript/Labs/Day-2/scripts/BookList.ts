class BookList{
    allBooks: any[]=[];
    booksRead: number=0;
    booksNotRead: number=this.allBooks.length;
    currentBook: Book | null ;
    lastBook: Book | null;
    nextBook: Book | null;
    add(book){
        this.allBooks.push(book);
    }

    

    finishCurrentBook(){
        if(this.currentBook){
            this.currentBook.read = true;
            this.currentBook.readDate = new Date(Date.now());
            this.lastBook = this.currentBook;
            this.currentBook = this.nextBook;
            this.nextBook = this.findNextBook();
            this.booksRead++;
            this.booksNotRead--;
        }
    }

    findNextBook():Book| null {
        for( const book of this.allBooks){
            if(!book.read){
                return book;
            }
        }
        return null;
    }

}

class Book{
    title: string;
    genre: string;
    author: string;
    read: boolean;
    readDate: Date | null;
    constructor(givenTitle: string, givenGenre: string, givenAuthor: string){
        this.title=givenTitle;
        this.genre=givenGenre;
        this.author=givenAuthor;
        this.read = false;
        this.readDate=null;
    }
}

var book1 = new Book("Vikram","Action","Loki");
var book2 = new Book("Jersey","Cricket","Gowtham");
var book3 = new Book("The Lion King","Animation","AAAA");
var books = new BookList();
books.add(book1);
books.add(book2);
books.add(book3);
