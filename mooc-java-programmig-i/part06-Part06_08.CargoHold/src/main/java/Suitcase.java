import java.util.ArrayList;

public class Suitcase {
  private ArrayList<Item> items;
  private int maximunWeightLimit;

  public Suitcase(int maximunWeightLimit) {
    this.items = new ArrayList<>();
    this.maximunWeightLimit = maximunWeightLimit;
  }

  public int totalWeight() {
    int sum = 0;
    for (Item item : items) {
      sum += item.getWeight();
    }
    return sum;
  }

  public void addItem(Item item) {
    if (maximunWeightLimit >= totalWeight() + item.getWeight()) {
      this.items.add(item);
    }
  }

  public void printItems() {
    for (Item item : items) {
      System.out.println(item);
    }
  }

  public Item heaviestItem() {
    Item heaviestItem = null;

    int heaviestWeight = 0;
    for (Item item : items) {
      if (item.getWeight() > heaviestWeight) {
        heaviestWeight = item.getWeight();
        heaviestItem = item;
      }
    }

    return heaviestItem;
  }

  public String toString() {
    if (items.isEmpty()) {
      return "no items (0kg)";
    }
    if (items.size() == 1) {
      return "1 item (" + this.totalWeight() + "kg)";
    }
    // [ERROR]   B_SuitcaseTest.suitcaseLanguageFormatting:214 The toString method of a suitcase
    // containing 1 item should print "1 item (<weight> kg)"
    return items.size() + " items (" + totalWeight() + "kg)";
  }
}
