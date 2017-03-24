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

  @Test
  public void all_returnsAllInstancesOfTeam_true() {
    Team testTeam1 = new Team("The Best");
    Team testTeam2 = new Team("Cool Kids");
    assertEquals(true, Team.all().contains(testTeam1));
    assertEquals(true, Team.all().contains(testTeam2));
  }

  @Test
  public void clear_emptiesAllTeamsFromList_0() {
    Team testTeam = new Team("The Best");
    Team.clear();
    assertEquals(0, Team.all().size());
  }

  @Test
  public void getTeamId_teamInstantiatesWithAnId_1() {
    Team testTeam = new Team("The Best");
    assertEquals(1, testTeam.getTeamId());
  }

  @Test
  public void find_returnsTeamWithSameId_testTeam2() {
    Team.clear();
    Team testTeam1 = new Team("The Best");
    Team testTeam2 = new Team("Cool Kids");
    assertEquals(Team.find(testTeam2.getTeamId()), testTeam2);
  }

  @Test
  public void getMembers_initiallyReturnsEmptyList_ArrayList() {
    Team.clear();
    Team testTeam = new Team("The Best");
    assertEquals(0, testTeam.getMembers().size());
  }


}
