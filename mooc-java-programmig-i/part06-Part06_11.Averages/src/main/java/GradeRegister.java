import java.util.ArrayList;

public class GradeRegister {

  private ArrayList<Integer> grades;
  private ArrayList<Integer> points;

  public GradeRegister() {
    this.grades = new ArrayList<>();
    this.points = new ArrayList<>();
  }

  public void addGradeBasedOnPoints(int points) {
    this.grades.add(pointsToGrade(points));
    this.points.add(points);
  }

  public double averageOfPoints() {
    if (points.isEmpty()) {
      return -1;
    }
    int sum = 0;
    for (Integer point : points) {
      sum += point;
    }
    double result = 1.0 * sum / points.size();
    return result;
  }

  // [ERROR]   AveragesTest.printsInUserInterface2:218 Expected the output of the program to contain
  // the average of
  // the points. With the input:
  // 16
  // 8
  // -3
  // 62
  // 99
  // 101
  // 64
  //
  // the program should give 49.8 as the average of the points.

  public int numberOfGrades(int grade) {
    int count = 0;
    for (int received : this.grades) {
      if (received == grade) {
        count++;
      }
    }

    return count;
  }

  public double averageOfGrades() {
    int sum = 0;
    for (Integer grade : grades) {
      sum += grade;
    }
    double result = 1.0 * sum / grades.size();
    return grades.isEmpty() ? -1 : result;
  }

  public static int pointsToGrade(int points) {

    int grade = 0;
    if (points < 50) {
      grade = 0;
    } else if (points < 60) {
      grade = 1;
    } else if (points < 70) {
      grade = 2;
    } else if (points < 80) {
      grade = 3;
    } else if (points < 90) {
      grade = 4;
    } else {
      grade = 5;
    }

    return grade;
  }
}
