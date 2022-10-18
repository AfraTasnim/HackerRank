/* https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?isFullScreen=true*/


String s = "We promptly judged antique ivory buckles for the next prize"



def isValid( String s){
    String message = "pangram"
    String alphabetsLowercase = "abcdefghijklmnopqrstuvwxyz "
    String alphabetsUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"



    for (int i = 0 ; i< alphabetsLowercase.length()-1; i++) {

        if ( s.contains(alphabetsUppercase.charAt(i)as String) == false && s.contains(alphabetsLowercase.charAt(i)as String) == false) {

            message = "not pangram"
        }
    }
    return message

}

println(isValid(s))