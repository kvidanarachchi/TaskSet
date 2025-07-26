import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkipTest {

    @Test
    public void skiptest1()
    {
        System.out.println("A");
        if(true)
        {
            throw new SkipException("test will be skipped at this point");
        }
        System.out.println("B");
    }
    @Test(enabled = false)
    public void skiptest2()
    {
        System.out.println("A");
        System.out.println("B");
    }

}
