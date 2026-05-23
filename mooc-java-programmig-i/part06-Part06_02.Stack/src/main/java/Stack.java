import java.util.ArrayList;

public class Stack {
  private ArrayList<String> list;

  public Stack() {
    this.list = new ArrayList<>();
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public void add(String str) {
    list.add(str);
  }

  public ArrayList<String> values() {
    return list;
  }

  public String take() {
    String result = list.get(list.size() - 1);
    list.remove(result);
    return result;
  }
}
