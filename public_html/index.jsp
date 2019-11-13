<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2//EN">

<html>
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org">
    <link type="text/css" rel="stylesheet" href="ourcss.css">

    <title>Left, Center, Right Diagram</title>
  </head>

  <body>
    <h1>Left, Center, Right Diagram</h1>

    <h3>The Player Bean: Controlling the Bits and Bobs</h3>
    <table>
        <tr><th>Instance Variable</th><th>Description</th></tr>
        <tr><td>private int ownedPot</td><td>The number of Skittles each player has</td></tr>
        <tr><td>private int playerNumber</td><td>Each player's number, to keep track of where we are in the play loop</td></tr>
        <tr><td>private int diceOne</td><td>The first die</td></tr>
        <tr><td>private int diceTwo</td><td>The second die</td></tr>
        <tr><td>private int diceThree</td><td>The third die</td></tr>
        <tr><td>private int playerPosition</td><td>Each player's position in the playerList Array</td></tr>
    <table>

    <h3>The DiceEngine Bean: Running the Game</h3>
    <table>
        <tr><th>Instance Variable</th><th>Description</th></tr>
        <tr><td>private int centerPot</td><td>The number of Skittles in the center</td></tr>
        <tr><td>private ArrayList&lt;Playe&gt;</td><td>The collection of Players</td></tr>
        <tr><td>private Player playerOne</td><td>The first Player</td></tr>
        <tr><td>private Player playerTwo</td><td>The second Player</td></tr>
        <tr><td>private Player playerThree</td><td>The third Player</td></tr>
        <tr><td>private String win</td><td>A win/lose string that is passed to the CSS to control the endgame output</td></tr>
        <tr><td>private Player leftPlayer</td><td>The player to the left of the current Player being processed in the run loop</td></tr>
        <tr><td>private Player rightPlayer</td><td>The player to the right of the current Player being processed in the run loop</td></tr>
    <table>

    <h3>How the Game Runs</h3>




    <a href="/java112/lcr">Take Me To The Game!</a>

  </body>
</html>
