boolean prime

int count = 0
        
        for (int i=2; count<1000 ; i++) {
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