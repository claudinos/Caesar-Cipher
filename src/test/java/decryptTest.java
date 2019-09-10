import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class decryptTest {

    @Test
    public void testDecrypt() {
        decrypt testDecrypt = new decrypt();
        String Output = "hi";
        assertEquals(Output, testDecrypt.decry( "hello",  4 ));
    }


}
