import java.util.ArrayList;

public class Room {
  private ArrayList<Person> persons;

  public Room() {
    this.persons = new ArrayList<>();
  }

  public void add(Person person) {
    this.persons.add(person);
  }

  public boolean isEmpty() {
    return persons.isEmpty();
  }

  public ArrayList<Person> getPersons() {
    return persons;
  }

  public Person shortest() {
    if (persons.isEmpty()) {
      return null;
    }

    Person isShortest = persons.get(0);
    for (Person person : persons) {
      if (person.getHeight() < isShortest.getHeight()) {
        isShortest = person;
      }
    }
    return isShortest;
  }

  public Person take() {
    Person s = shortest();
    persons.remove(shortest());
    return s;
  }
}
