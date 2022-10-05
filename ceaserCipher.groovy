/*https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true*/

String input = System.in.newReader().readLine()

int key = System.in.newReader().readLine() as int

def getCipherText(String input, int key)
{
    String alphabetsLowercase = "abcdefghijklmnopqrstuvwxyz"
    String alphabetsUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    def output = []



    for (int i = 0; i< input.length(); i++) {
        if (input.charAt(i).isLowerCase() == true) {

            Character currentCharacter = input.charAt(i)

            int index = alphabetsLowercase.findIndexOf { it -> it == (currentCharacter) }

            int currentIndex = (index + key) % 26

            Character replacedCharacter = alphabetsLowercase.charAt(currentIndex)
            output.add(replacedCharacter)


        }
        if (input.charAt(i).isUpperCase()== true){

            Character currentCharacter = input.charAt(i)

            int index = alphabetsUppercase.findIndexOf { it -> it == (currentCharacter) }

            int currentIndex = (index + key) % 26

            Character replacedCharacter = alphabetsUppercase.charAt(currentIndex)
            output.add(replacedCharacter)


        }
        if(input.charAt(i).isLowerCase() == false && input.charAt(i).isUpperCase()== false){

            output.add(input.charAt(i))
        }


    }
    output= output.join()
    return output
}

println(getCipherText( input, key))
