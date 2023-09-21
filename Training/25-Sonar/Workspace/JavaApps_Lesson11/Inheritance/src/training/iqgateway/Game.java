package training.iqgateway;

public class Game extends InventoryItem {
    
    private int gameId;
    
    private String name;
    
    private int duration;
    
    private int noOfPlayers;
    
    private String category;
    
    public Game() {
        
    }

    public Game(int gameId, String name, int duration, int noOfPlayers,String category) {
        super();
        this.gameId = gameId;
        this.name = name;
        this.duration = duration;
        this.noOfPlayers = noOfPlayers;
        this.category = category;
       
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

}
