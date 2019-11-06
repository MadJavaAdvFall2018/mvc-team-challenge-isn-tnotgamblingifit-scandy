package java112.project3;
import java.util.*;

/**
 *  This is a JavaBean to demonstrate using beans with JSP.
 *
 *@author    mHall
 */
public class Player extends Object {

    private  int  ownedPot;
    private String name;


    /**
     *  Constructor for the Player object
     */
    public Player() {
        ownedPot = 10;
    }


    /**
     *  Gets the ownedPot attribute of the Player object
     *
     *@return    The mySpecialData value
     */
    public String getOwnedPot() {
        return ownedPot;
    }


    /**
     *  Sets the mySpecialData attribute of the Player object
     *
     *@param  ownedPot  The new mySpecialData value
     */
    public void setOwnedPot(String ownedPot) {
        this.mySpecialData = ownedPot;
    }

    /**
     * Gets the name attribute of the Player object
     *
     * @return name of player
     */
    public int getName() {
        return name;
    }

    /** Sets the name attribute of the Player object
     *
     * @param name name of player
     */
    public void getName(int name) {
        this.name = name;
    }

}
