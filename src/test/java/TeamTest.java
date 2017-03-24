import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void Team_instantiatesCorrectly_true() {
    Team testTeam = new Team("The Best");
    assertEquals(true, testTeam instanceof Team);
  }

  @Test
  public void getTeamName_teamInstantiatesWithTeamName_TheBest() {
    Team testTeam = new Team("The Best");
    assertEquals("The Best", testTeam.getTeamName());
  }
}
