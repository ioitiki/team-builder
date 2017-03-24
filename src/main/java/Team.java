import java.util.List;
import java.util.ArrayList;

public class Team {
  private String mTeamName;
  private static List<Team> teams = new ArrayList<Team>();
  private int mTeamId;
  private List<Member> members = new ArrayList<Member>();
  private int mMemberId;

  public Team(String name) {
    mTeamName = name;
    teams.add(this);
    mTeamId = teams.size();
    mMemberId = members.size();
  }

  public String getTeamName() {
    return mTeamName;
  }

  public static List<Team> all() {
    return teams;
  }

}
