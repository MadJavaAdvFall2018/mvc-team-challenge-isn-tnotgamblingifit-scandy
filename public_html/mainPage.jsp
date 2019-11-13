<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2//EN">

<html>
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org">
    <link type="text/css" rel="stylesheet" href="ourcss.css">
    <title>Player screen</title>
  </head>

  <body id="${engine.win}">
    <header>
          <h1>Left, Center, Right</h1>
          <h2>Directions: Hit Roll. Do it again. And again. And again. The game will eventually end when someone has all the coins...erm, we mean "Skittles."</h2>
          <h2>KEY</h2>
          <ul>
              <li id="blueKey">If you roll BLUE, you give a Skittle to the player on your LEFT.</li>
              <li id="redKey">If you roll RED, you give a Skittle to the player on your RIGHT.</li>
              <li class="centerKey">If you roll C, you put a Skittle in the CENTER.</li>
              <li id="dotKey">If you roll WHITE, nothing happens. How vanilla!</li>
              <li class="centerKey">If you roll THREE Cs, you GET ALL THE SKITTLES IN THE CENTER!</li>
          </ul>
    </header>

    <main class="dice_grid">
    <!-- <p>Data from my bean: ${myCoolBean.mySpecialData}</p> -->


            <div id="left">
                <div class="smallDice"  id="d${engine.playerThree.diceOne}"></div>
                <div></div>
                <div class="smallDice"  id="d${engine.playerThree.diceTwo}"></div>
                <div>${engine.playerThree.ownedPot}</div>
                <div class="smallDice"  id="d${engine.playerThree.diceThree}"></div>

                <!-- static html styling
                <div class="smallDice" id="d1"></div>
                <div></div>
                <div class="smallDice" id="d4"></div>
                <div>${left}</div>
                <div class="smallDice" id="d5"></div> -->
            </div>

            <div class="center">
                ${engine.centerPot}
            </div>

            <div id="right">

                <!-- static html styling
                <div></div>
                <div class="smallDice" id="d1"></div>
                <div>${right}</div>
                <div class="smallDice" id="d4"></div>
                <div></div>
                <div class="smallDice" id="d5"></div> -->


                <div></div>
                <div class="smallDice" id="d${engine.playerTwo.diceOne}"></div>
                <div>${engine.playerTwo.ownedPot}</div>
                <div class="smallDice" id="d${engine.playerTwo.diceTwo}"></div>
                <div></div>
                <div class="smallDice" id="d${engine.playerTwo.diceThree}"></div>
            </div>


            <%-- static html styling --%>
            <!-- <div class="dice" id="d1"></div>
            <div class="dice" id="d4"></div>
            <div class="dice" id="d5"></div> -->
            <div class="dice" id="d${engine.playerOne.diceOne}"></div>
            <div class="dice" id="d${engine.playerOne.diceTwo}"> </div>
            <div class="dice" id="d${engine.playerOne.diceThree}"> </div>




            <a href="/java112">Home</a>
            <form class="center" method="post">
                <input id="roll" type="submit" value="Roll Dice"/>
            </form>
            <p class="center">${engine.playerOne.ownedPot}</p>
    </main>

    <footer>

    </footer>
  </body>
</html>
