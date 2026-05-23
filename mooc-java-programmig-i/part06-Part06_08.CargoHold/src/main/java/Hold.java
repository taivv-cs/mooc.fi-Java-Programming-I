import java.util.ArrayList;

public class Hold {
  private int maximunWeight;
  private ArrayList<Suitcase> suitcases;

  public Hold(int maximunWeight) {
    this.maximunWeight = maximunWeight;
    this.suitcases = new ArrayList<>();
  }

  public int totalWeightHold() {
    int totalSuitcases = 0;
    for (Suitcase suitcase : suitcases) {
      totalSuitcases += suitcase.totalWeight();
    }
    return totalSuitcases;
  }

  public void addSuitcase(Suitcase suitcase) {
    if (suitcase.totalWeight() + totalWeightHold() <= maximunWeight) {
      this.suitcases.add(suitcase);
    }
  }

  public void printItems() {
    for (Suitcase suitcase : suitcases) {
      suitcase.printItems();
    }
  }

  public String toString() {
    return this.suitcases.size() + " suitcases (" + this.totalWeightHold() + "kg)";
  }
}
