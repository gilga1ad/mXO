package m8e3_anonymous;

/**
 * Created by kollaps on 21.04.16.
 */
public class TextPrinter implements IPrinter {

    String text;

    public TextPrinter(String text) {
        this.text = text;
    }

    @Override
    public void printText() {
        System.out.println(text);
    }
}
