<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2//EN">

<html>
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org">
    <link type="text/css" rel="stylesheet" href="ourcss.css">
    <title>Player screen</title>
  </head>

  <body>
    <header>
          <h1>Left, Right, Center</h1>
          <h2>change the file type back to jsp after layout is figured out</h2>
    </header>

    <main class="dice_grid">
    <!-- <p>Data from my bean: ${myCoolBean.mySpecialData}</p> -->


            <div id="left">
                <div class="smallDice"  id="d${playerThree.diceOne}"></div>
                <div></div>
                <div class="smallDice"  id="d${playerThree.diceTwo}"></div>
                <div>${playerThree.ownedPot}</div>
                <div class="smallDice"  id="d${playerThree.diceThree}"></div>

                <!-- static html styling
                <div class="smallDice" id="d1"></div>
                <div></div>
                <div class="smallDice" id="d4"></div>
                <div>${left}</div>
                <div class="smallDice" id="d5"></div> -->
            </div>

            <div class="center">
                ${centerPot}
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
                <div class="smallDice" id="d${playerTwo.diceOne}"></div>
                <div>${playerTwo.ownedPot}</div>
                <div class="smallDice" id="d${playerTwo.diceTwo}"></div>
                <div></div>
                <div class="smallDice" id="d${playerTwo.diceThree}"></div>
            </div>


            static html styling
            <!-- <div class="dice" id="d1"></div>
            <div class="dice" id="d4"></div>
            <div class="dice" id="d5"></div> -->
            <div id="d${playerOne.diceOne}"></div>
            <div id="d${playerOne.diceTwo}"> </div>
            <div id="d${playerOne.diceThree}"> </div>




            <a href="/java112">Home</a>
            <form class="center" action="#" method="post">
                <input id="roll" type="submit" value="Roll Dice"/>
            </form>
            <p class="center">${playerOne.ownedPot}</p>
    </main>

    <footer>

    </footer>
  </body>
</html>
