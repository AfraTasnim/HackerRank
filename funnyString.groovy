/*https://www.hackerrank.com/challenges/funny-string/problem?isFullScreen=true*/
String s = System.in.newReader().readLine()


List makeListOfIntegers(String s){
    List subtractionList =[]

    for(int i = 0; i<s.length()-1; i++)  {
        int subtraction = 0
        if( s[i] > s[i+1]){

            subtraction = s.charAt(i) as int - s.charAt(i+1) as int
        }
        else {
            subtraction = s.charAt(i+1) as int - s.charAt(i) as int
        }
        subtractionList.add(subtraction)

    }
    return subtractionList
}

String funnyString(String s){

    String message = "funny"
    String r = s.reverse()

    List subtractionOfOriginalString = makeListOfIntegers(s)

    List subtractionOfReversedString = makeListOfIntegers(r)

    for(int i = 0; i <subtractionOfOriginalString.size(); i++){

        if(subtractionOfOriginalString[i] != subtractionOfReversedString[i]){
             return message = "not funny"
        }
    }

    return message
}
println(funnyString(s))
