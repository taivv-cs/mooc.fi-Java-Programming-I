import java.util.ArrayList;

public class ManagerObservation {

    private ArrayList<Observation> observations;

    public ManagerObservation() {
        this.observations = new ArrayList<>();
    }

    public void add(Observation observation) {
        this.observations.add(observation);
    }

    public Observation searchName(String name) {
        for (Observation o : observations) {
            if (o.getName().equals(name)) {
                return o;
            }
        }
        return null;
    }

    public void printAll() {
        for (Observation o : observations) {
            System.out.println(o);
        }
    }
}
