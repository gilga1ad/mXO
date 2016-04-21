package m8e3_anonymous;

/**
 * Created by kollaps on 21.04.16.
 */
public class Starter3 {

    public static void main(String[] args) {
        /**По логике экземпляр интерфейса создать невозможно, но если поставить {},
         * то будет создан анонимный класс, который реализовывает данный интерфейс
         * (если в теле реализовать методы интерфейса)**/
        final IPrinter printer = new IPrinter() {

            @Override
            public void printText() {
                System.out.println("Text to print");
            }

        };
        printer.printText();
    }

}
