import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member testMember = new Member("John Smith", "Java Dev");
    assertEquals(true, testMember instanceof Member);
  }

  @Test
  public void getMemberName_memberInstantiatesWithMemberName_JohnSmith() {
    Member testMember = new Member("John Smith", "Java Dev");
    assertEquals("John Smith", testMember.getMemberName());
  }

  @Test
  public void getJob_memberInstantiatesWithJob_JavaDev() {
    Member testMember = new Member("John Smith", "Java Dev");
    assertEquals("Java Dev", testMember.getJob());
  }



}
