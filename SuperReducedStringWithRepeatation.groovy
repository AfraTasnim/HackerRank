/*https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true*/



def inputString="aabbaccadda"
def getReducedString(String inputString) {

def currentString=inputString
    for (int i = 0; i < currentString.length(); i++) {

        def targetString = currentString[i] + currentString[i]
        if (currentString.contains(targetString)) {
            currentString = currentString.replaceAll(targetString, "")
            i=0
        }

        if (currentString.length()== 0) {
            def message = "Empty String"
            return message

        }
    }
    return currentString
}
println(getReducedString(inputString))