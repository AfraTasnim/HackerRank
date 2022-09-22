def inputString= "thisIsTheInputString"
def getNumberOfWords(String inputString){
    def numberOfWords=1
    for(int i=1; i< inputString.length();i++){

        if( Character.isUpperCase( inputString.charAt(i)) == true){


            numberOfWords=numberOfWords+1

        }


    }


    return numberOfWords
}
println(getNumberOfWords(inputString))