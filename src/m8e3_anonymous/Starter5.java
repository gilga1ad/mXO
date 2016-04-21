package m8e3_anonymous;

/**
 * Created by kollaps on 21.04.16.
 */
public class Starter5 {

    private String text;

    public static void main(String[] args) {
        Starter5 starter5 = new Starter5();
        starter5.text = "12";
        starter5.m();
    }

    /**Случай, когда анонимный класс создается в non-static методе.**/
    public void m() {
        /**Теперь анонимный класс является inner (non-static) class и
         * может обращатся в полям экземпяра внешнего класса (Starter5)**/
        final IPrinter printer = new IPrinter() {

            @Override
            public void printText() {
                System.out.println(text);
            }

        };
        printer.printText();
        text = "12";        /**Поле класса уже не обязано быть effectively final**/
        /**Дело в том, что анонимный класс нахватывает переменную this, которая не меняется.
         * Из под переменной this уже можно вызывать другие поля класса.**/
    }

}
