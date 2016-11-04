
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MorseTest {

    Morse m;

    @Before
    public void setUp() {

        m = new Morse();
    }

    @Test
    public void morseWorksAtLeastSomehow() {

        assertEquals(".... . .-.. .-.. --- / .-- --- .-. .-.. -..", m.translate("Hello World"));
    }

    @Test
    public void spacesAtTheEndAndBeginningAreGottenRidOf() {

        assertEquals("- . ... - / .. -. .--. ..- -", m.translate("test input    "));
        assertEquals(".- / -... / / -.-.", m.translate("    a b  c "));
    }

    @Test
    public void spacePrintsEmpty() {

        assertEquals("", m.translate(" "));
    }

    @Test
    public void spacesPrintEmpty() {

        assertEquals("", m.translate("       "));
    }

    @Test
    public void emptyPrintsEmpty() {

        assertEquals("", m.translate(""));
    }

    @Test
    public void unknownCharactersToQuestionMarks() {

        assertEquals(".-.. ? ? -.- ? --- ..- .--.", m.translate("L€€K$oup"));
    }

    @Test
    public void unknownCharactersToQuestionMarks2() {

        assertEquals("?", m.translate("@"));
    }
}
