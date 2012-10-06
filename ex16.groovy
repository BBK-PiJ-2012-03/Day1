int scor = 0

while ( scor.abs() < 3) {

println ("Give me the input of the game")
String str = System.console().readLine()

while ((str!="PR") && (str!="RS") && (str!="SP") && (str!="PS") && (str!="RP") && (str!="SR") && (str!="PP") && (str!="RR") && (str!="SS"))
{ println ("Wrong input!")
  break
}
  


if ( (str=="PR") || (str=="RS") || (str=="SP") )
   scor++

if ( (str=="PS") || (str=="RP") || (str=="SR") )
   scor--

}




if (scor==3)
println ("End of game, first player wins")

else
prntln ("End of game, second player wins")