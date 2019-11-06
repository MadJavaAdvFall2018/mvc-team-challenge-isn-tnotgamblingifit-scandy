package java112.project3;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *  This is a JavaBean to demonstrate using beans with JSP.
 *
 *@author    mHall
 */
public class DiceEngine extends Object {

    private  int  centerPot;
    private ArrayList<Player> playerList;


    /**
     *  Constructor for the BeanOne object
     */
    public DiceEngine() {
        centerPot = 0;
    }


    public void setNumberOfPlayers(int playerCount) {
        int i = 0; // int i will be initialized to 0 each time we call this function; is that OK, or should I edit this?
        for (i <= playerCount) {
            Player newPlayer = new Player();
            newPlayer.setName = i;
            i++; // I incremented the player name number so that not all players will be named "0"
        }
    }

   public void rollDice(Player activePlayer){
        int generateRoll = ThreadLocalRandom.current().nextInt(1,6);
   }

}
