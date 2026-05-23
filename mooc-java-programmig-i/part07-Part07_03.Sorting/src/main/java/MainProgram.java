import java.util.Arrays;

public class MainProgram {

  public static void main(String[] args) {
    // write your test code here
    int[] array = {3, 1, 5, 99, 3, 12};

    MainProgram.sort(array);
    for (int i = 0; i < array.length; ++i) {
      System.out.println(Arrays.toString(array));
    }
  }

  public static int smallest(int[] array) {
    int result = array[0];
    for (int i = 1; i < array.length; ++i) {
      if (array[i] < result) {
        result = array[i];
      }
    }
    return result;
  }

  public static int indexOfSmallest(int[] array) {
    int smallestElement = smallest(array);

    for (int i = 0; i < array.length; ++i) {
      if (smallestElement == array[i]) {
        return i;
      }
    }
    return 0;
  }

  public static int indexOfSmallestFrom(int[] table, int startIndex) {
    int smallestElement = table[startIndex];
    for (int i = startIndex; i < table.length; ++i) {
      if (table[i] < smallestElement) {
        smallestElement = table[i];
      }
    }

    for (int i = startIndex; i < table.length; ++i) {
      if (table[i] == smallestElement) {
        return i;
      }
    }
    return 0;
  }

  public static void swap(int[] array, int index1, int index2) {
    int tmp = array[index1];
    array[index1] = array[index2];
    array[index2] = tmp;
  }

  public static void sort(int[] array) {
    for (int i = 0; i < array.length; ++i) {
      int smallestIndex = indexOfSmallestFrom(array, i);
      swap(array, smallestIndex, i);
    }
  }
}
