package java112.project3;

import java.util.*;

/**
 *  Represents a Player object.
 *
 *@author    mHall
 */
public class Player extends Object {

    private int ownedPot;
    private int playerNumber;

    /**
     *  Constructor for the Player object
     */
    public Player() {
        ownedPot = 3;
    }

    /**
     *  Gets the ownedPot attribute of the Player object
     *
     *@return    The ownedPot value
     */
    public int getOwnedPot() {
        return ownedPot;
    }

    /**
     *  Sets the ownedPot attribute of the Player object
     *
     *@param  ownedPot  The new ownedPot value
     */
    public void setOwnedPot(int ownedPot) {
        this.ownedPot = ownedPot;
    }

    /**
     * Gets the playerNumber attribute of the Player object
     *
     * @return player number
     */
    public int getPlayerNumber() {
        return playerNumber;
    }

    /** Sets the playerNumber attribute of the Player object
     *
     * @param playerNumber player number
     */
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
