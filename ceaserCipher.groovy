/*https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true*/

String input = System.in.newReader().readLine()

int key = System.in.newReader().readLine() as int

def getCipherText(String s, int k)
{
    String alphabetsLowercase = "abcdefghijklmnopqrstuvwxyz"
    String alphabetsUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    def output = []



    for (int i = 0; i< s.length(); i++) {
        if (s.charAt(i).isLowerCase() == true) {

            Character currentCharacter = s.charAt(i)

            int index = alphabetsLowercase.findIndexOf { it -> it == (currentCharacter) }

            int currentIndex = (index + k) % 26

            Character replacedCharacter = alphabetsLowercase.charAt(currentIndex)
            output.add(replacedCharacter)


        }
        if (s.charAt(i).isUpperCase()== true){

            Character currentCharacter = s.charAt(i)

            int index = alphabetsUppercase.findIndexOf { it -> it == (currentCharacter) }

            int currentIndex = (index + k) % 26

            Character replacedCharacter = alphabetsUppercase.charAt(currentIndex)
            output.add(replacedCharacter)


        }
        if(s.charAt(i).isLowerCase() == false && s.charAt(i).isUpperCase()== false){

            output.add(s.charAt(i))
        }


    }
    output= output.join()
    return output
}

println(getCipherText( input, key))
