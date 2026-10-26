
public class Main {
    public static void main(String[] args) {

        InventoryComponent sword = new Item("Sword", 5.0);
        InventoryComponent potion = new Item("Health Potion", 1.0);

        sword.displayInfo();
        potion.displayInfo();

        System.out.println("Sword weight: " + sword.getWeight());
        System.out.println("Potion weight: " + potion.getWeight());
    }
}
