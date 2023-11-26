package ex2;
import java.util.ArrayList;
import java.util.List;
public class Bouquet {
    private List<String> flowers;
    public Bouquet(){
        flowers = new ArrayList<>();
    }
    public List<String> getAll(){
        return flowers;
    }
    public void add(String flower){
        if (!flowers.contains(flower)){
            flowers.add(flower);
        }
    }
    public boolean remove(String flower){
        return flowers.remove(flower);
    }
}
