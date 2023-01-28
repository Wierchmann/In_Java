import org.junit.Test;
import static org.junit.Assert.*;

public class ConcatRemoveTest {
    @Test
    public void testConcatRemove() {
        // Sucess 
        assertEquals("yes", concatRemove.concatRemove("bla bla bla bla", "blablabcde", 8));
        assertEquals("yes", concatRemove.concatRemove("tab", "tab", 7));
        assertEquals("no", concatRemove.concatRemove("dragon", "spider", 6));
        assertEquals("no", concatRemove.concatRemove("no easter egg", "easter egg", 6));
        assertEquals("yes", concatRemove.concatRemove("same", "same", 2));
        
        // Fails
        assertNotEquals("yes", concatRemove.concatRemove("bla bla bla bla", "blablabcde", 7));
        assertNotEquals("yes", concatRemove.concatRemove("tab", "tab", 8));
        assertNotEquals("yes", concatRemove.concatRemove("dragon", "spider", 5));
    }
}

