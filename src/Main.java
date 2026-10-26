
public class Main {
    public static void main(String[] args) {

        InventoryComponent sword = new Item("Sword", 5.0);
        InventoryComponent potion = new Item("Health Potion", 1.0);

        Bag pouch = new Bag("Belt Pouch", 0.5);

        pouch.add(sword);
        pouch.add(potion);

        pouch.displayInfo();

        System.out.println("Total Weight: " + pouch.getWeight() + " lbs");
    }
}
