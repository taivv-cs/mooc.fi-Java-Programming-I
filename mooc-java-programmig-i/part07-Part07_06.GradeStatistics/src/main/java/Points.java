import java.util.ArrayList;

public class Points {

    private ArrayList<Integer> arrayList;

    public Points() {
        this.arrayList = new ArrayList<Integer>();
    }

    public boolean isValid(int num) {
        return num >= 0 && num <= 100;
    }

    public void addPoint(int num) {
        arrayList.add(num);
    }

    public double averageAll() {
        int sum = 0;
        for (Integer i : arrayList) {
            sum += i;
        }

        return (1.0 * sum) / arrayList.size();
    }

    public double averagePassing() {
        int count = 0;
        int sum = 0;
        for (Integer i : arrayList) {
            if (i >= 50) {
                sum += i;
                ++count;
            }
        }

        return count == 0 ? 0.0f : (1.0 * sum) / count;
    }

    public double passPercentage() {
        int passing = 0;
        for (Integer i : arrayList) {
            if (i >= 50) {
                ++passing;
            }
        }

        return this.arrayList.size() == 0
            ? 0.0
            : (100.0f * passing) / this.arrayList.size();
    }

    public void showGradeDistribution() {
        int failed = 0;
        int gradeOne = 0;
        int gradeTwo = 0;
        int gradeThree = 0;
        int gradeFour = 0;
        int gradeFive = 0;

        for (Integer i : arrayList) {
            if (i < 50) {
                ++failed;
            } else if (i < 60) {
                ++gradeOne;
            } else if (i < 70) {
                ++gradeTwo;
            } else if (i < 80) {
                ++gradeThree;
            } else if (i < 90) {
                ++gradeFour;
            } else if (i >= 90) {
                ++gradeFive;
            }
        }

        for (int i = 5; i >= 0; --i) {
            System.out.print(i + ": ");
            if (i == 5) {
                for (int j = 0; j < gradeFive; ++j) {
                    System.out.print("*");
                }
                System.out.println();
            }

            if (i == 4) {
                for (int j = 0; j < gradeFour; ++j) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i == 3) {
                for (int j = 0; j < gradeThree; ++j) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i == 2) {
                for (int j = 0; j < gradeTwo; ++j) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i == 1) {
                for (int j = 0; j < gradeOne; ++j) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i == 0) {
                for (int j = 0; j < failed; ++j) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
