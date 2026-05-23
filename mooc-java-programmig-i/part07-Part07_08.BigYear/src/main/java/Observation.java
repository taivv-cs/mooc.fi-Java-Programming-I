public class Observation {

    private String name;
    private String nameInLatin;
    private int countObservations;

    public Observation(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.countObservations = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getNameInLatin() {
        return this.nameInLatin;
    }

    public int getObservations() {
        return this.countObservations;
    }

    public void increase() {
        ++this.countObservations;
    }

    public String toString() {
        return (
            this.name +
            "(" +
            this.nameInLatin +
            "): " +
            countObservations +
            " observations\n"
        );
    }
}
