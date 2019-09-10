import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class encryptTest {

    @Test
    public void testEncrypt() {
        encrypt testEncrypt = new encrypt();
        String Output = "hi";
        assertEquals(Output, testEncrypt.encry( "hello",  4 ));
    }



}
