import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;

public class AssersionTest {
    @Test
    public void softAssertion()
    {
        SoftAssert ast= new SoftAssert();
        System.out.println("A");
        ast.assertEquals("ABD", "ABC", "Expecting ABC but actual is ABD");
        System.out.println("B");
        ast.assertTrue(false,"condition is falling");
        System.out.println("C");
        ast.assertEquals("3","3","Expected int not met");
        System.out.println("D");
        ast.assertFalse(true);
        System.out.println("E");
        System.out.println("F");
        ast.assertAll();
    }


}
