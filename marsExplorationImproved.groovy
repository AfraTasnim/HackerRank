/*https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true*/
String receivedMessage = System.in.newReader().readLine()

int getNumberOfChangedLetters( String receivedMessage){

    int numberOfLettersChanged = 0
    for (int i = 0; i < receivedMessage.length() ; i++) {


        if (i % 3 == 0 || i % 3==2){

            if(receivedMessage[i] != "S") {

                numberOfLettersChanged++
            }
        }
        else{

            if (receivedMessage[i] != "O") {
                numberOfLettersChanged++


            }
        }

        }

    return numberOfLettersChanged
}

println(getNumberOfChangedLetters(receivedMessage))

