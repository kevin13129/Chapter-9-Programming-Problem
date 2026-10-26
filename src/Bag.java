
import java.util.ArrayList;

public class Bag extends InventoryComponent {

    private String name;
    private double baseWeight;
    private ArrayList<InventoryComponent> items = new ArrayList<>();

    public Bag(String name, double baseWeight) {
        this.name = name;
        this.baseWeight = baseWeight;
    }

    @Override
    public void add(InventoryComponent component) {
        items.add(component);
    }

    @Override
    public void remove(InventoryComponent component) {
        items.remove(component);
    }

    @Override
    public InventoryComponent getChild(int i) {
        return items.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        double totalWeight = baseWeight;

        for (InventoryComponent item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - " + baseWeight + " lbs (empty)");

        for (InventoryComponent item : items) {
            item.displayInfo();
        }
    }
}
