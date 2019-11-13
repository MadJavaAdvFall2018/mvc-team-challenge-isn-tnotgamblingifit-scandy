package java112.project3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *  Represents dice rolls and gameplay.
 *
 *@author    mHall
 */
public class DiceEngine {

    private int centerPot;
    private ArrayList<Player> playerList;
    private String result;
    private Player playerOne;
    private Player playerTwo;
    private Player playerThree;

    /**
     *  Constructor for the DiceEngine object
     */
    public DiceEngine() {
        playerList = new ArrayList<Player>();

        playerOne = new Player();
        playerOne.setPlayerNumber(1);
        playerOne.setPlayerPosition(0);
        playerList.add(playerOne);

        playerTwo = new Player();
        playerTwo.setPlayerNumber(2);
        playerTwo.setPlayerPosition(1);
        playerList.add(playerTwo);

        playerThree = new Player();
        playerThree.setPlayerNumber(3);
        playerThree.setPlayerPosition(2);
        playerList.add(playerThree);

        centerPot = 0;
    }

    /**
     * Returns value of centerPot
     * @return centerPot value
     */
    public int getCenterPot() {

        return centerPot;
    }

    /**
     * Sets new value of centerPot
     * @param centerPot value
     */
    public void setCenterPot(int centerPot) {

        this.centerPot = centerPot;
    }

    /**
     * Returns value of playerList
     * @return playerList the list of players
     */
    public ArrayList<Player> getPlayerList() {

        return playerList;
    }

    /**
     * Sets new value of playerList
     * @param playerList the list of players
     */
    public void setPlayerList(ArrayList<Player> playerList) {

        this.playerList = playerList;
    }

    /**
     * Returns value of result
     * @return result
     */
    public String getResult() {

        return result;
    }

    /**
     * Sets new value of result
     * @param result
     */
    public void setResult(String result) {

        this.result = result;
    }

    /**
     * Returns value of playerOne
     * @return playerOne Player
     */
    public Player getPlayerOne() {

        return playerOne;
    }

    /**
     * Sets new value of playerOne
     * @param playerOne Player
     */
    public void setPlayerOne(Player playerOne) {

        this.playerOne = playerOne;
    }

    /**
     * Returns value of playerTwo
     * @return playerTwo Player
     */
    public Player getPlayerTwo() {

        return playerTwo;
    }

    /**
     * Sets new value of playerTwo
     * @param playerTwo Player
     */
    public void setPlayerTwo(Player playerTwo) {

        this.playerTwo = playerTwo;
    }

    /**
     * Returns value of playerThree
     * @return playerThree Player
     */
    public Player getPlayerThree() {

        return playerThree;
    }

    /**
     * Sets new value of playerThree
     * @param playerThree Player
     */
    public void setPlayerThree(Player playerThree) {

        this.playerThree = playerThree;
    }

    public void run() {
        for(Player player : playerList) {
            generateRolls(player);

        }
    }

    public void generateRolls(Player activePlayer) {
        if (activePlayer.getOwnedPot() >= 3) {
            activePlayer.setDiceOne(ThreadLocalRandom.current().nextInt(1,6));
            activePlayer.setDiceTwo(ThreadLocalRandom.current().nextInt(1,6));
            activePlayer.setDiceThree(ThreadLocalRandom.current().nextInt(1,6));
            if (activePlayer.getDiceOne() == 5 && activePlayer.getDiceTwo() == 5 && activePlayer.getDiceThree() == 5) {
                threeCenter(activePlayer);
            } else {
                checkRolls(activePlayer, activePlayer.getDiceOne());
                checkRolls(activePlayer, activePlayer.getDiceTwo());
                checkRolls(activePlayer, activePlayer.getDiceThree());
            }
        } else if (activePlayer.getOwnedPot() == 2) {
            activePlayer.setDiceOne(ThreadLocalRandom.current().nextInt(1,6));
            activePlayer.setDiceTwo(ThreadLocalRandom.current().nextInt(1,6));
            activePlayer.setDiceThree(1);

            checkRolls(activePlayer, activePlayer.getDiceOne());
            checkRolls(activePlayer, activePlayer.getDiceTwo());

        } else if (activePlayer.getOwnedPot() == 1) {
            activePlayer.setDiceOne(ThreadLocalRandom.current().nextInt(1,6));
            activePlayer.setDiceTwo(1);
            activePlayer.setDiceThree(1);
            checkRolls(activePlayer, activePlayer.getDiceOne());
        }
    }

    public void checkRolls(Player activePlayer, int generateRoll) {

        if (generateRoll == 1 || generateRoll == 2 || generateRoll == 6) {
            result = "Dot";
        } else if (generateRoll == 4) {
            result = "Left";
            left(activePlayer);
        } else if (generateRoll == 5) {
            result = "Center";
            center(activePlayer);
        } else if (generateRoll == 3) {
            result = "Right";
            right(activePlayer);
        }
    }

    public void threeCenter(Player activePlayer) {
            activePlayer.setOwnedPot(activePlayer.getOwnedPot() + this.centerPot);
            setCenterPot(0);

    }

    public void left(Player activePlayer) {
        Player leftPlayer;

        activePlayer.setOwnedPot(activePlayer.getOwnedPot() - 1);
        if (activePlayer.getPlayerNumber() != (playerList.size())) {
            leftPlayer = playerList.get(activePlayer.getPlayerPosition()); //this is not okay. ArrayList values:0,1,2  Player numbers:1,2,3
            leftPlayer.setOwnedPot(leftPlayer.getOwnedPot() + 1);
        } else {
            leftPlayer = playerList.get(0);
            leftPlayer.setOwnedPot(leftPlayer.getOwnedPot() + 1);
        }
    }

    public void center(Player activePlayer) {
        activePlayer.setOwnedPot(activePlayer.getOwnedPot() - 1);
        centerPot++;
    }

    public void right(Player activePlayer) {
        // local variables
        Player rightPlayer;

        activePlayer.setOwnedPot(activePlayer.getOwnedPot() - 1);
        if (activePlayer.getPlayerNumber() != 0) {
            rightPlayer = playerList.get(activePlayer.getPlayerNumber() - 1);
            rightPlayer.setOwnedPot(rightPlayer.getOwnedPot() + 1);
        } else {
            rightPlayer = playerList.get(playerList.size() - 1);
            rightPlayer.setOwnedPot(rightPlayer.getOwnedPot() + 1);
        }
    }

}
