public class Archive {
  private String indentifier;
  private String name;

  public Archive(String indentifier, String name) {
    this.indentifier = indentifier;
    this.name = name;
  }

  public String getIndentifier() {
    return this.indentifier;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object target) {
    if (this == target) {
      return true;
    }

    if (!(target instanceof Archive)) {
      return false;
    }

    Archive comparedTarget = (Archive) target;

    return comparedTarget.indentifier.equals(this.indentifier);
  }

  @Override
  public String toString() {
    return String.format("%s: %s", this.indentifier, this.name);
  }
}
