package j101_interface;

import j101_interface.printer.AdvConsolePrinter;
import j101_interface.printer.ConsolePrinter;
import j101_interface.printer.IPrinter;
import j101_interface.reader.IReader;
import j101_interface.reader.PredefinedReader;

/**
 * Created by kollaps on 17.04.16.
 */
public class Replacer {

    private final IReader reader;

    private final IPrinter printer;

    /**Можно передать любую реализацию IReader, которая удовлетворяет
     * интерфейсу IReader, и любую реализацию, которая удовлетворяет
     * интерфейсу IPrinter**/
    public Replacer(final IReader reader,
                    final IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    /**Можно использовать методы интерфейса, даже когда реализация
     * к ним ещё не готова (либо вообще отсутствует)**/
    public void replace() {
        final String text = reader.read();
        final String replacedText = text.replace(":)", "=)");
        printer.print(replacedText);
    }

    /**Сделаем полный цикл**/
    public static void main(String[] args) {
        /**После new можно указать любую реализацию данного интерфейса**/
        final IReader reader =  new PredefinedReader("adfef:) adfeljkev:)kjge :):)kljve");
        final IPrinter printer = new ConsolePrinter();
        final IPrinter advPrinter = new AdvConsolePrinter();

        final Replacer replacer = new Replacer(reader, printer);
        final Replacer advReplacer = new Replacer(reader, advPrinter);

        replacer.replace();
        advReplacer.replace();
    }
}
