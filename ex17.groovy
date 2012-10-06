//Tha parei enan arithmo apo ton xristi.

//Tha sigrinei an einai megaliteros apo OLH thn lista twn prwtwn aritmwn enan pros enan (EPANALIPSI)

//Otan vrei oti einai megaliteros apo enan arithmo, tha sigrinei tin diafora tou me ton arithmo pou vrike, me tin apoliti timi tis diaforas tou me ton epomeno prwto arithmo.

//Ama einai mikroterh tha tipwsei ton prwto.
//Ama einai megaliterh tha tipwsei ton deutero.
//Ama einai ish tha tous tipwsei k tous duo.

//-------------------------------------------------------------------

println ("Give me ur number")
String str = System.console().readLine()
int num = Integer.parseInt(str)







boolean prime
int tool = 0
int counter = 0



        
        for (int i=2; i<1000 ; i++) {
            prime = true
            
            for (int b=2; b<i; b++){
                if ((i%b) == 0)
                    prime = false
            }
            if (prime){ 
                    
                

                    if (num>i) { 
                    counter++ 
                    tool = i

                     }

                            
            }
        }

//  Tool einai o amesws mikroteros prwtos arithmos apo auton p dinei o xristis
// Counter einai to ti noumero sti seira twn prwtwn einai autos o prwtos arithmos tool



int count = 0
int tool2 = 0
        
        for (int i=2; count<counter+1 ; i++) {
            prime = true
            
            for (int b=2; b<i; b++){
                if ((i%b) == 0)
                    prime = false
            }
            if (prime){
                count++
                tool2 = i
            }
        }


//tool2 einai o epomenos prwtos arithmos

//GAMISA

if ((num-tool)<(tool2-num))
   println("The closest prime number is " +tool)

if ((num-tool)>(tool2-num))
    println("The closest prime number is " +tool2)

if ((num-tool)==(tool2-num))
   println("The closest prime numbers are " +tool+ " and " +tool2)
