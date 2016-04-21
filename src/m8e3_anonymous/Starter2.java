package m8e3_anonymous;

/**
 * Created by kollaps on 21.04.16.
 */
public class Starter2 {

    public static void main(String[] args) {
        /**Если после объявления конструктора поставить {}, то в этом
         * месте будет создан новый класс (анонимный класс), который наследуется
         * от класс TextPrinter. В фигурный скобках можно переопределять его методы.**/
        final IPrinter textPrinter = new TextPrinter("Text to print") {

            /**Для анонимного класса будет создан конструктор, который на вход
             * принимает "Text to print" и передает его в конструктор класса,
             * от которого он наследуется (TextPrinter).
             * Иными словами у анономного класса автоматически будет создан конструктор,
             * такой же как и конструктор родителя.
             * Собственный конструктор создать невозможно, т. к. имя класса не существует.**/

            @Override
            public void printText() {
                System.out.println("*********");
                super.printText();
            }

        };
        textPrinter.printText();
    }

}
