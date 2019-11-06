package java112.project3;
import java.util.*;

/**
 *  This is a JavaBean to demonstrate using beans with JSP.
 *
 *@author    mHall
 */
public class DiceEngine extends Object {

    private  int  centerPot;
    private int numberOfPlayers;


    /**
     *  Constructor for the BeanOne object
     */
    public BeanOne() {
        centerPot  = 0;
    }


   public void setNumberOfPlayers(int playerCount) {
       numberOfPlayers = playerCount;
   }

}
