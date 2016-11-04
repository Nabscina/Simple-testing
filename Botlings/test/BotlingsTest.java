/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BotlingsTest {

    Botlings folly;
    Botlings killifish;

    @Before
    public void setUp() {

        folly = new Botlings("F", 1, "Brace yourself for the grand finale!");
        killifish = new Botlings("K", 3, "xcd");
    }

    @Test
    public void setNameWorksCorrectly() {

        folly.setName("Folly");
        assertEquals("Folly", folly.name());

        killifish.setName("Killifish");
        assertEquals("Killifish", killifish.name());
    }

    @Test
    public void badNameCannotBeSet() {

        killifish.setName("");
        assertEquals("K", killifish.name());

        folly.setName("xcdxcdxcdxcdxcdxcdxcdxcd");
        assertEquals("F", folly.name());
    }

    @Test
    public void setAgeWorksCorrectly() {

        killifish.setAge(6);
        assertEquals(6, killifish.age());

        folly.setAge(1337);
        assertEquals(1337, folly.age());
    }

    @Test
    public void badAgeCannotBeSet() {

        killifish.setAge(9999);
        assertEquals(3, killifish.age());

        folly.setAge(-99);
        assertEquals(1, folly.age());
    }
    
    @Test
    public void alwaysPasses() {
        
        assertEquals("The bot passes the Turing test.", killifish.passOrNot());
        assertEquals("The bot passes the Turing test.", folly.passOrNot());
    }
    
    @Test
    public void toStringWorksCorrectly() {
        
        assertEquals("F, age: 1 month, \"Brace yourself for the grand finale!\"", folly.toString());
        assertEquals("K, age: 3 months, \"xcd\"", killifish.toString());
    }
    
    
}
