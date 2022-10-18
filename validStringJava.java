import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        String message = "pangram";
        String alphabetsLowercase = "abcdefghijklmnopqrstuvwxyz ";
        String alphabetsUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        for (int i = 0 ; i< alphabetsLowercase.length(); i++) {

            if (s.contains(alphabetsLowercase.subSequence(i, i+1)) == false && s.contains(alphabetsUppercase.subSequence(i,i+1)) == false)
            {

                message = "not pangram";
            }
        }
        return message;

    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
