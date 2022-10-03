//https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?isFullScreen=true//



String inputString = System.in.newReader().readLine()

String checkHackerRank( String inputString ) {

    String hackerrankString = "hackerrank"

    String message = "NO"
    int j = 0;


    for (int i = 0; i < inputString.length(); i++) {


        if (hackerrankString.charAt(j) == inputString.charAt(i)) {

            j++
            if (j == hackerrankString.length()){
                break
            }


        }

    }
    if ( j == hackerrankString.length()){
        message = "YES"

    }


    return message
}

println(checkHackerRank( inputString))



