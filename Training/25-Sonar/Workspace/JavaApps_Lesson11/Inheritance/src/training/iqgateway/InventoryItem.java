package training.iqgateway;

public class InventoryItem {

    private String condition;

    private float price;

    public InventoryItem() {
        System.out.println("No Arg Constructor From InventoryItem ");
    }

    public InventoryItem(String condition, float price) {
        super();
        this.condition = condition;
        this.price = price;
        System.out.println("Parameterised Constructor From InventoryItem");
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    
    public static void welcome() {
        System.out.println("Static Welcome From InventoryItem ");
    }
    
    public void sayHello() {
        System.out.println("Hello From Inventory Item ... ");
    }
}
