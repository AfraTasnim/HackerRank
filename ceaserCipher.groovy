 String input = System.in.newReader().readLine()

 int key = System.in.newReader().readLine() as int
 println(key)

 def getCipherText(String input, int key)
 {
     String alphabets = "abcdefghijklmnopqrstuvwxyz"
    def index= 0

     for (int i = 0; i< input.length(); i++){

     Character currentCharacter = input.charAt(i)

             index = alphabets.findIndexOf {it-> it == (currentCharacter)}



        int currentIndex = (index+key) % 26

         Character replacedCharacter = alphabets.charAt(currentIndex)

         input[i] = replacedCharacter




         println(currentCharacter)
         println(key)
         println(index)
         println(currentIndex)
         println(replacedCharacter)
         println(input[i])

     }
         return input
     }

 println(getCipherText( input, key))