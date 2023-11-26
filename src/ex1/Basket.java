package ex1;
import java.util.List;
import java.util.ArrayList;
public class Basket {
    private List<String> fruits;

    public Basket(){
        fruits = new ArrayList<>();
    }
    public boolean find(String fruit){
        return fruit.contains(fruit);
    }
    public boolean remove(String fruit){
        return fruits.remove(fruit);
    }
    public int position(String fruit){
        return fruits.indexOf(fruit);
    }
    public List<String> distinct(){
        List<String> uniqueFruits = new ArrayList<>();
        for (String fruit : fruits){
            if (!uniqueFruits.contains(fruit)){
                uniqueFruits.add(fruit);
            }
        }
        return uniqueFruits;
    }
    public void add(String fruit){
        fruits.add(fruit);
    }
    public int count(){
        int count = 0;
        for(String fruit : fruits){
            count++;
        }
        return count;
    }
}
