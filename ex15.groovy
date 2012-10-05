int numberToGuess = Math.abs(1000 * Math.random())
println ("Try to guess my number")
int counter = 0
boolean end = true

while (end) {

String str = System.console().readLine()
int firstGuess = Integer.parseInt(str)


if (firstGuess < numberToGuess)
println ("My number is higher")


if (firstGuess > numberToGuess)
println ("My number is lower")

if (firstGuess == numberToGuess)
end = false

counter++



}
println ("Correct with " +counter + "guesses")