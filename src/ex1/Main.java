package ex1;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.add("banana");
        basket.add("orange");
        basket.add("grape");
        basket.add("apple");

        System.out.println("apple in basket= "+ basket.find("apple"));
        System.out.println("orange removed= "+ basket.remove("orange"));
        System.out.println("apple position= "+ basket.position("Apple"));

        Collection<String> uniqueFruits = basket.distinct();
        System.out.println("unique fruits: "+ uniqueFruits);

        System.out.println("total fruits: "+basket.count());
    }
}
