
public class Main {
    public static void main(String[] args) {

        // Main backpack
        Bag backpack = new Bag("Main Backpack", 2.0);

        // Loose items
        backpack.add(new Item("Bedroll", 3.0));
        backpack.add(new Item("Rope", 2.0));

        // Potion pouch
        Bag potionPouch = new Bag("Potion Pouch", 0.5);
        potionPouch.add(new Item("Health Potion", 1.0));
        potionPouch.add(new Item("Mana Potion", 1.0));

        // Bag of holding
        Bag holdingBag = new Bag("Bag of Holding", 1.0);
        holdingBag.add(new Item("Sword", 5.0));

        // Bag inside another bag
        Bag gemBag = new Bag("Gem Bag", 0.2);
        gemBag.add(new Item("Ruby", 0.3));

        holdingBag.add(gemBag);

        // Add smaller bags to backpack
        backpack.add(potionPouch);
        backpack.add(holdingBag);

        // Display full inventory
        System.out.println("---FULL INVENTORY---");
        backpack.displayInfo();
        System.out.println("Total Weight: " + backpack.getWeight() + " lbs");

        // Display one pouch separately
        System.out.println("\n---POTION POUCH---");
        potionPouch.displayInfo();
        System.out.println("Pouch Weight: " + potionPouch.getWeight() + " lbs");

        // Test unsupported operation
        InventoryComponent sword = new Item("Extra Sword", 5.0);

        try {
            sword.add(new Item("Potion", 1.0));
        } catch (UnsupportedOperationException e) {
            System.out.println("\nCannot add items inside a sword!");
        }

        // Test an empty bag
        Bag emptyBag = new Bag("Empty Bag", 0.5);

        System.out.println("\n=== EMPTY BAG TEST ===");
        emptyBag.displayInfo();
        System.out.println("Weight: " + emptyBag.getWeight() + " lbs");

        // Test removing an item
        Bag testBag = new Bag("Test Bag", 1.0);
        Item apple = new Item("Apple", 2.0);

        testBag.add(apple);

        System.out.println("\n=== REMOVE ITEM TEST ===");
        System.out.println("Before: " + testBag.getWeight() + " lbs");

        testBag.remove(apple);

        System.out.println("After: " + testBag.getWeight() + " lbs");

    }

}
