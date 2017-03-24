import java.util.List;
import java.util.ArrayList;

public class Member {
  private String mName;
  private String mJob;
  private static ArrayList<Member> members = new ArrayList<Member>();
  private int mId;

  public Member(String name, String job) {
    mName = name;
    mJob = job;
    members.add(this);
    mId = members.size();
  }

  public String getName() {
    return mName;
  }

  public String getJob() {
    return mJob;
  }






}
