package j101_interface.printer;

/**
 * Created by kollaps on 17.04.16.
 */
public class AdvConsolePrinter implements IPrinter {

    @Override
    public void print(String text) {
        System.out.println(text);
        System.out.println(String.format("String length: %d", text.length()));
    }
}
