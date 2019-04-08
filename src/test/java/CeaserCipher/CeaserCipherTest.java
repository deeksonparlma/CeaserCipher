package CeaserCipher;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CeaserCipherTest {
    public String getGreeting() {
        return "Hello world.";
    }

    @Test
    public void runCeaserCipher_isEntryString_String() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        String expectedOutput = "cdef";
        assertEquals(expectedOutput, testCeaserCipher.encrypt("abcd", 2));
    }
    @Test
    public void runCeaserCipher_isEntryDecrypted_String() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        String expectedOutput = "abcd";
        assertEquals(expectedOutput, testCeaserCipher.decrypt("cdef", 2));
    }
}
