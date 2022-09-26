 /*https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true*/



 def receivedMessage = System.in.newReader().readLine()

 int getNumberOfChangedLetters( String receivedMessage){

     int numberOfLettersChanged = 0
     for (int i = 0; i < receivedMessage.length() -1; i++) {

         if(receivedMessage[i] !="S"){


             numberOfLettersChanged++

         }
         if (receivedMessage[i+1]!= "O"){

             numberOfLettersChanged++

         }

         if (receivedMessage[i+2]!= "S"){

             numberOfLettersChanged++

         }

         i= i+2
     }
     return numberOfLettersChanged
 }

println(getNumberOfChangedLetters(receivedMessage))


