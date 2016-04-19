package j101_String; /**
 * Created by kollaps on 16.04.16.
 */
import java.util.*;

class Strings {

    /** invert the string
     * 	example:
     *	- input: "input string"
     *	- output: "gnirts tupni"
     **/
    public String task1(final String in) {
        StringBuilder out = new StringBuilder();
        for (int i = in.length()-1; i >= 0; i--) {
            out.append(in.charAt(i));
        }
        return out.toString();
    }

    /** invert the tokens int the string
     * 	example:
     *	- input: "input string to the method test2"
     *	- output: "tupni gnirts ot eht dohtem 2tset"
     **/
    public String task2(final String in) {
        final String[] strings = in.split(" ");
        final StringBuilder sb = new StringBuilder();
        Arrays.asList(strings).forEach(s -> sb.append(task1(s) + " "));
        return sb.toString().trim();
    }

    /** count the target character in the String
     * 	example:
     *	- input: "input string to the method test2", 't'
     *	- output: 7
     **/
    public int task3(final String in, final char target) {
        int count = 0;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

}
