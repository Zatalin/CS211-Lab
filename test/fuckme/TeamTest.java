package fuckme;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Alice on 6/26/14.
 */
public class TeamTest {

    Player[] players = {new Player("Keith Dun", "GK", 10)};

    @Test
    public void testConstuct() {
        Team t = new Team("CID", "Country", players);
        assertEquals("Country", t.getCountry());
        assertEquals("CID", t.getCID());
        assertArrayEquals(players, t.getPlayers());
    }

    @Test
    public void testToString() {
        Team t = new Team("CID", "Country", players);
        assertEquals("Country\nKeith Dun - GK 10", t.toString());
    }
}
