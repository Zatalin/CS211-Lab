package fuckme;

import java.util.ArrayList;

/**
 * Created by eric on 6/26/14.
 */
public class Team {
    private String cid;
    private String country;
    private Player[] players;

    public Team(String cid, String country, Player[] players){
        this.cid = cid;
        this.country = country;
        this.players = players;
    }

    public Team(String fileLine){

    }

    public String getCID() {
        return cid;
    }

    public String getCountry() {
        return country;
    }

    public Player[] getPlayers() {
        return players;
    }
}