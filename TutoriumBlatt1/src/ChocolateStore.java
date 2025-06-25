import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ChocolateStore {

    ArrayList<Chocolate> chocolates ;
    HashMap<Chocolate,Integer> verfuegbarkeitsMap;
    Stack<Chocolate> chocolateStack;

    public ChocolateStore(){
        chocolates = new ArrayList<>();
        verfuegbarkeitsMap = new HashMap<>();
        chocolateStack = new Stack<>();
    }
    public void addchocolate(Chocolate chocolate){
        chocolates.add(chocolate);
    }

    public void showAllChocolates(){

        for (Chocolate chocolate:chocolates){
            System.out.println(chocolate.toString());
        }
    }

    private void updateAvalability(boolean gekauft, Chocolate chocolate){

        if(gekauft){
            verfuegbarkeitsMap.put(chocolate, verfuegbarkeitsMap.getOrDefault(chocolate,0)+1);
        }else {
            verfuegbarkeitsMap.put(chocolate, verfuegbarkeitsMap.get(chocolate)-1);
        }

    }

    public void sellchocolate(Chocolate chocolate){
        updateAvalability(false,chocolate);
        chocolateStack.push(chocolate);
        System.out.println("Verkauft: " + chocolate.toString());
    }

    public void displayChocolateQuantity(Chocolate chocolate){
        System.out.println("Für die Chocolade:" + chocolate.getName() + "haben wir noch" + verfuegbarkeitsMap.get(chocolate));
    }
}
