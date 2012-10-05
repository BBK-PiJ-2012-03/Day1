boolean prime

int count = 0
        
        for (int i=1; count<1001 ; i++) {
            prime = true
            
            for (int b=2; b<i; b++){
                if ((i%b) == 0)
                    prime = false
            }
            if (prime){
                count++
                println (i)
            }
        }