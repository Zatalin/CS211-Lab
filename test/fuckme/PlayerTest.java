package fuckme;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void testBasicPlayerConst(){
        Player p = new Player("Test", "MF", 1);
        assertEquals("Test",p.getName());
        assertEquals("MF", p.getPosition());
        assertEquals(1, p.getJersey());
    }

    @Test
    public void testSimpleCutString(){
         String playerStr = "(1)  GK  Thibaut Courtois                   ##  16, Atlético Madrid (ESP)";
         String[] cuts = Player.cutString(playerStr);
         String[] correct = {"(1)", "GK", "Thibaut Courtois"};
         assertArrayEquals(correct, cuts);
    }

    @Test
    public void testWordyCutString(){
         String playerStr = "(1)  GK  A Stupidly Long Name            ##  16, Atlético Madrid (ESP)";
         String[] cuts = Player.cutString(playerStr);
         String[] correct = {"(1)", "GK", "A Stupidly Long Name"};
         assertArrayEquals(correct, cuts);
    }

    @Test
    public void testByStringConst(){
        String playerStr = "(1)  GK  Thibaut Courtois                   ##  16, Atlético Madrid (ESP)";
        Player p = new Player(playerStr);
        assertEquals(1, p.getJersey());
        assertEquals("GK", p.getPosition());
        assertEquals("Thibaut Courtois", p.getName());
    }

    @Test
    public void testToString() {
        Player p = new Player("Thibaut Courtois", "GK", 1);
        String s = "Thibaut Courtois - GK 1";
        assertEquals(s, p.toString());
    }

}