/* https://www.hackerrank.com/challenges/alternating-characters/problem?isFullScreen=true*/
int q = System.in.newReader().readLine() as int

    for (int j = 0; j< q ; j++) {
        def s = System.in.newReader().readLine()

        println(alternatingCharacters(s))
    }

def alternatingCharacters(String s) {
    int count = 0

    for (int i = 0; i < (s.length() - 1); i++) {



        if (s[i] == s[i + 1]) {
            count++

        }

    }
    return count
}