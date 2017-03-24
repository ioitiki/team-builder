import java.util.List;
import java.util.ArrayList;

public class Member {
  private String mName;
  private String mDescription;
  private static ArrayList<Member> members = new ArrayList<Member>();
  private int mId;

  public Member(String name, String description) {
    mName = name;
    mDescription = description;
    members.add(this);
    mId = members.size();
  }

  public String getName() {
    return "test";
  }




}
