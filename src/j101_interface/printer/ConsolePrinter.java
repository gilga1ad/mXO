package j101_interface.printer;

/**
 * Created by kollaps on 17.04.16.
 */

/**Ключевое слово implements говорит, что данный класс соответствует
 * реализации интерфейча IPrinter**/
/**После implements перечисляются все интерфейсы, который класс
 * будет реализовывать**/
public class ConsolePrinter implements IPrinter {

    @Override   /**Этот метод перегружает метод интерфейса**/
    public void print(final String text) {
        System.out.println(text);
    }

}
