 //https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?isFullScreen=true//



 String inputString = System.in.newReader().readLine()

 String checkHackerRank( String inputString ) {

     String hackerrankString = "hackerrank"

     String message = "NO"
     int j = 0;


     for (int i = 0; i < inputString.length(); i++) {



         if (hackerrankString[j] == inputString[i]) {

             j++
             if (j= hackerrankString.length()){
                 message = "YES"
                 break
            }

         }

     }


return message
 }

 println(checkHackerRank( inputString))



