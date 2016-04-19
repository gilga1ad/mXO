package j101_String;

/**
 * Created by kollaps on 16.04.16.
 */
public class FromString {

    public int fromString(final char[] chars) {
        if (chars.length == 0) return 0;
        int result = 0;
        for (int i = 0; i < 3 && i < chars.length; i++) {
            if (i == 0 && chars[i] == '-') continue;
            final char ch = chars[i];
            final int r = Integer.valueOf(String.valueOf(ch));
            result *= 10;
            result += r;

        }
        return chars[0] == '-' ? -result : result;
    }

}
