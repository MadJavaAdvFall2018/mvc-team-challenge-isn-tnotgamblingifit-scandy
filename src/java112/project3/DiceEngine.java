package java112.project3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *  Represents dice rolls and gameplay.
 *
 *@author    mHall
 */
public class DiceEngine extends Object {

    private int centerPot;
    private ArrayList<Player> playerList;
    private String result;
    private int generateRoll1; 
    private int generateRoll2; 
    private int generateRoll3;
     

    /**
     *  Constructor for the DiceEngine object
     */
    public DiceEngine() {
        playerList = new ArrayList<Player>();
        Player playerOne = new Player();
        playerList.add(playerOne);
    
        Player playerTwo = new Player();
        playerList.add(playerTwo);
        
        Player playerThree = new Player();
        playerList.add(playerThree);
        centerPot = 0;
    }


    /**
    * Returns value of centerPot
    * @return
    */
    public int getCenterPot() {
        return centerPot;
    }

    /**
    * Sets new value of centerPot
    * @param
    */
    public void setCenterPot(int centerPot) {
        this.centerPot = centerPot;
    }

    /**
    * Returns value of playerList
    * @return
    */
    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    /**
    * Sets new value of playerList
    * @param
    */
    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    /**
    * Returns value of result
    * @return
    */
    public String getResult() {
        return result;
    }

    /**
    * Sets new value of result
    * @param
    */
    public void setResult(String result) {
        this.result = result;
    }

    /**
    * Returns value of generateRoll1
    * @return
    */
    public int getGenerateRoll1() {
        return generateRoll1;
    }

    /**
    * Sets new value of generateRoll1
    * @param
    */
    public void setGenerateRoll1(int generateRoll1) {
        this.generateRoll1 = generateRoll1;
    }

    /**
    * Returns value of generateRoll2
    * @return
    */
    public int getGenerateRoll2() {
        return generateRoll2;
    }

    /**
    * Sets new value of generateRoll2
    * @param
    */
    public void setGenerateRoll2(int generateRoll2) {
        this.generateRoll2 = generateRoll2;
    }

    /**
    * Returns value of generateRoll3
    * @return
    */
    public int getGenerateRoll3() {
        return generateRoll3;
    }

    /**
    * Sets new value of generateRoll3
    * @param
    */
    public void setGenerateRoll3(int generateRoll3) {
        this.generateRoll3 = generateRoll3;
    }

    public void run() {
        for(Player player : playerList) {
            generateRolls(plater);

        }
    }

    public void generateRolls(Player activePlayer) {
        if (activePlayer.getOwnedPot() => 3) {
            generateRoll1 = ThreadLocalRandom.current().nextInt(1,6);
            generateRoll2 = ThreadLocalRandom.current().nextInt(1,6);
            generateRoll3 = ThreadLocalRandom.current().nextInt(1,6);
            if (getGenerateRoll1() == 5 && getGenerateRoll2() == 5 && getGenerateRoll3() == 5) {
                threeCenter(activePlayer);
            }
        } else if (activePlayer.getOwnedPot() == 2) {
            generateRoll1 = ThreadLocalRandom.current().nextInt(1,6);
            generateRoll2 = ThreadLocalRandom.current().nextInt(1,6);
        } else if (activePlayer.getOwnedPot() == 1) {
            generateRoll1 = ThreadLocalRandom.current().nextInt(1,6);
        } 
    }

    public void checkRolls(Player activePlayer, int generateRoll) {

        if (generateRoll == 1 || generateRoll == 2 || generateRoll == 3) {
            result = "Dot";
        } else if (generateRoll == 4) {
            result = "Left";
            left(activePlayer);
        } else if (generateRoll == 5) {
            result = "Center";
            center(activePlayer);
        } else if (generateRoll == 6) {
            result = "Right";
            right(activePlayer);
        }
    }

    public void threeCenter(Player activePlayer) {
            activePlayer.setOwnedPot(activePlayer.getOwnedPot() + centerPot);
            centerPot = 0;
     
    }

    public void rollTwoDice(Player activPlayer) {

    }

    public void left(Player activePlayer) {
        // local variables
        Player leftPlayer;

        activePlayer.setOwnedPot = ownedPot - 1;
        if (activePlayer.getPlayerNumber() != (playerList.length() - 1)) {
            leftPlayer = playerList.get(activePlayer.getPlayerNumber() + 1);
            leftPlayer.setOwnedPot(ownedPot++);
        } else {
            leftPlayer = playerList.get(0);
            leftPlayer.setOwnedPot(ownedPot++);
        }
    }

    public void center() {
        activePlayer.setOwnedPot = ownedPot - 1;
        centerPot++;
    }

    public void right() {
        // local variables
        Player rightPlayer;

        activePlayer.setOwnedPot = ownedPot - 1;
        if (activePlayer.getPlayerNumber != 0) {
            rightPlayer = playerList.get(activePlayer.getPlayerNumber() - 1);
            rightPlayer.setOwnedPot(ownedPot++);
        } else {
            rightPlayer = playerList.get(playerList.length() - 1);
            rightPlayer.setOwnedPot(ownedPot++);
        }


    }

}
