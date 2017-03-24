import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member testMember = new Member("John Smith", "Java Dev");
    assertEquals(true, testMember instanceof Member);
  }

}
