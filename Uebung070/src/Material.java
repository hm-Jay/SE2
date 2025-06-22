import java.util.ArrayList;
import java.util.List;

public class Material  {
    private String name;
    private double inStock;
    private List<EventHandler<Material>> handlerList = new ArrayList<>();

    public Material(String name){
        this.name = name;
        this.inStock = 0;
    }

    public void addToStock(double amount){
        inStock = inStock + amount;
        for(EventHandler<Material> handler:handlerList){
            handler.handle(this);
        }
    }

    public void removeFromStock(double amount){
        inStock = inStock - amount;
        for(EventHandler<Material> handler:handlerList){
            handler.handle(this);
        }
    }

    public String getName(){
        return name;
    }

    public double getInStock(){
        return inStock;
    }

    public void addStockChangedHandler(EventHandler<Material> handler){
        handlerList.add(handler);
    }
}
