/*
Sami's spaceship crashed on Mars! She sends  sequential SOS messages to Earth for help.

NASA_Mars_Rover.jpg

Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, , determine how many letters of Sami's SOS have been changed by radiation.

Input Format

There is one line of input: a single string, .

Note: As the original message is just SOS repeated  times, 's length will be a multiple of .

Constraints

 will contain only uppercase English letters.
Output Format

Print the number of letters in Sami's message that were altered by cosmic radiation.

Sample Input 0

SOSSPSSQSSOR
Sample Output 0

3
Explanation 0

 = SOSSPSSQSSOR, and signal length . Sami sent  SOS messages (i.e.: ).

Expected signal: SOSSOSSOSSOS
Recieved signal: SOSSPSSQSSOR

We print the number of changed letters, which is .

Sample Input 1

SOSSOT
Sample Output 1

1
Explanation 1

 = SOSSOT, and signal length . Sami sent  SOS messages (i.e.: ).

Expected Signal: SOSSOS 
Received Signal: SOSSOT

We print the number of changed letters, which is .
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String st="";
        int count=0;
        int i=0;
        while(i<S.length()-2){
            st=S.substring(i,i+3);
            if(st.charAt(0)!='S'){
                count++;
            }
            if(st.charAt(1)!='O'){
                count++;
            }
            if(st.charAt(2)!='S'){
                count++;
            }
            i=i+3;
            }    
           
        System.out.println(count); 
        
    }
}
