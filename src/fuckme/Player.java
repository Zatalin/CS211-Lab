package fuckme;

/**
 * Created by eric on 6/26/14.
 */
public class Player {
    private String name;
    private String position;
    private int jersey;

    public static String[] cutString(String fileLine){
        String[] parts = fileLine.split("  ");
        String[] values = {parts[0], parts[1], parts[2]};
        return values;
    }

    public String getName(){
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getJersey() {
        return jersey;
    }

    public  Player(String name, String position, int jersey){
        this.name = name;
        this.position = position;
        this.jersey = jersey;
    }

    public Player(String fileLine) {
        String[] parts =  cutString(fileLine);
        String numStr = parts[0];
        numStr = numStr.replace("(", "").replace(")", "");

        this.jersey = Integer.parseInt(numStr);
        this.position = parts[1];
        this.name = parts[2];
    }

    public String toString(){
        return name + " - " + position + " " + jersey;
    }

}
/* (1)  GK  Thibaut Courtois                   ##  16, Atlético Madrid (ESP)
*/

