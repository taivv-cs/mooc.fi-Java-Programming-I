import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
  private ExerciseManagement exerciseManagement;

  @Before
  public void init() {
    exerciseManagement = new ExerciseManagement();
  }

  @Test
  public void exerciseListWhenListIsEmpty() {
    init();
    assertEquals(0, exerciseManagement.exerciseList().size());
  }

  @Test
  public void addingExerciseGrowListByOne() {
    init();
    exerciseManagement.add("Write a test");
    assertEquals(1, exerciseManagement.exerciseList().size());
  }

  @Test
  public void addedExerciseIsInList() {
    init();
    exerciseManagement.add("Write a test");
    assertTrue(exerciseManagement.exerciseList().contains("Write a test"));
  }

  @Test
  public void exerciseCanBeMarkAsCompleted() {
    exerciseManagement.add("New exercise");
    exerciseManagement.markAsCompleted("New exercise");
    assertTrue(exerciseManagement.isCompleted("New exercise"));
  }

  @Test
  public void newExerciseIsNotCompleted() {
    manager.add("Write code");

    assertFalse(manager.isCompleted("Write code"));
  }
}
