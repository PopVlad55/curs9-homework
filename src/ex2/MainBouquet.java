package ex2;

public class MainBouquet {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();

        bouquet.add("trandafir");
        bouquet.add("lalea");
        bouquet.add("narcisa");
        bouquet.add("narcisa");

        System.out.println("flowers: "+ bouquet.getAll());
        System.out.println("remove lalea= "+ bouquet.remove("lalea"));
        System.out.println("flowers: "+ bouquet.getAll());
    }
}
