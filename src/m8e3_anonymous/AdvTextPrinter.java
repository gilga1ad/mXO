package m8e3_anonymous;

/**
 * Created by kollaps on 21.04.16.
 */
public class AdvTextPrinter extends TextPrinter {

    public AdvTextPrinter(String text) {
        super(text);
    }

    @Override
    public void printText() {
        System.out.println("*********");
        super.printText();
    }

}
