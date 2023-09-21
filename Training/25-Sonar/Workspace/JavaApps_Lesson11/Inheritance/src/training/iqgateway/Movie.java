package training.iqgateway;

public class Movie extends InventoryItem {
    
    private int id;
    
    private String title;
    
    private String rating;
    
    public Movie() {
        super("Available", 500.0f);
        System.out.println("No Arg Constructor From Movie ");
        
    }

    public Movie(int id, String title, String rating) {
        super();
        this.id = id;
        this.title = title;
        this.rating = rating;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello From Movie ... ");
    }
    
    public static void welcome() {
        System.out.println("Static Welcome From InventoryItem ");
    }
}
