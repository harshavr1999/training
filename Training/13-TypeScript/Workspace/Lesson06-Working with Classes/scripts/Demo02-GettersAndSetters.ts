class Movie{
    private movId: number;
    private title: string;
    private rating: string;

    public getMovId(): number {
        return this.movId;
    }

    public setMovId(movId: number): void {
        this.movId = movId;
    }

    public getTitle(): string {
        return this.title;
    }

    public setTitle(title: string): void {
        this.title = title;
    }

    public getRating(): string {
        return this.rating;
    }

    public setRating(rating: string): void {
        this.rating = rating;
    }


    constructor(givenMovId, givenTitle, givenRating){
        this.movId=givenMovId;
        this.title=givenTitle;
        this.rating=givenRating;
    }



}