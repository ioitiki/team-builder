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
  public void addMember_addsMemberToListForATeam_true() {
    Team testTeam = new Team("The Best");
    Member testMember = new Member("John Smith", "Java Dev");
    testTeam.addMember(testMember);
    assertEquals(true, testTeam.getMembers().contains(testMember));
  }

  @Test
  public void getMembers_initiallyReturnsEmptyList_ArrayList() {
    Team.clear();
    Team testTeam = new Team("The Best");
    assertEquals(0, testTeam.getMembers().size());
  }

  @Test
  public void getMembers_returnsAListOfAllMembersInATeam_2() {
    Team.clear();
    Team testTeam = new Team("The Best");
    Member testMember1 = new Member("John Smith", "Java Dev");
    Member testMember2 = new Member("Bob Smit", "Web Dev");
    testTeam.addMember(testMember1);
    testTeam.addMember(testMember2);
    assertEquals(2, testTeam.getMembers().size());
  }

  @Test
  public void getMemberId_returnsIdForAMemberOfASpecificTeam_1() {
    Team.clear();
    Team testTeam1 = new Team("The Best");
    Member testMember1Team1 = new Member("John Smith", "Java Dev");
    Member testMember2Team1 = new Member("Bob Smit", "Web Dev");
    testTeam1.addMember(testMember1Team1);
    testTeam1.addMember(testMember2Team1);
    Team testTeam2 = new Team("Cool Kids");
    Member testMember1Team2 = new Member("Joe Bob", "Python Dev");
    Member testMember2Team2 = new Member("Anne Ridge", "Ruby Dev");
    testTeam2.addMember(testMember1Team2);
    testTeam2.addMember(testMember2Team2);
    assertEquals(1, testTeam1.getMemberId(testMember1Team1));
    assertEquals(2, testTeam2.getMemberId(testMember2Team2));
  }




}
