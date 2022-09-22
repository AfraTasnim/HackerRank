/*https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true*/


def inputString= "abbddccdd"
def getReducedString(String inputString) {

    def currentString = inputString


    for (int i = 0; i <= currentString.length()- 1; i++) {

        if (currentString[i] == currentString[i + 1]) {
            def targetString = currentString[i] + currentString[i + 1]
            currentString = currentString.replaceAll(targetString, "")
          
            if (currentString.length() == 0) {
                def message = "Empty String"
                return message
            }
        }
    }
return currentString
}
println(getReducedString(inputString))