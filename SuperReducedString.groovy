def inputString= "abbccbbcca"


def  getReducedString(String inputString) {

    def reducedString = inputString
    def currentLength=reducedString.length()

    for (int i = 0; i < currentLength - 1; i++) {


        if (inputString[i] == inputString[i + 1]) {
            def targetString = inputString[i] + inputString[i + 1]
            def currentString = reducedString.replace(targetString,'')
            reducedString=currentString
            println(currentString)
        }
    }

    return reducedString
}
println(getReducedString(inputString))



