import java.util.List;
import java.util.ArrayList;

public class Team {
  private String mTeamName;
  private static List<Team> teams = new ArrayList<Team>();
  private int mTeamId;
  private List<Member> members;
  private int mMemberId;

  public Team(String name) {
    mTeamName = name;
    teams.add(this);
    mTeamId = teams.size();
    members = new ArrayList<Member>();
  }

  public String getTeamName() {
    return mTeamName;
  }

  public static List<Team> all() {
    return teams;
  }

  public static void clear() {
    teams.clear();
  }

  public int getTeamId() {
    return mTeamId;
  }

  public static Team find(int teamId) {
    return teams.get(teamId - 1);
  }

  public void addMember(Member member) {
    members.add(member);
  }

  public List<Member> getMembers() {
    return members;
  }

  public int getMemberId(Member member) {
    return members.indexOf(member) + 1;
  }

  public Member findMember(int memberId) {
    return members.get(memberId - 1);
  }

}
