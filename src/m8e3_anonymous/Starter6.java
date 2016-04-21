package m8e3_anonymous;

/**
 * Created by kollaps on 21.04.16.
 */
/**Java каждый класс кладет в отдельный файл (с расширением .class), который может
 * использоватся для вызова данного класса. В данном случае 2 класса лежат в одном
 * файле (.java). После компиляции Java создаст 2 файла Starter6.class и Starter6$1.class,
 * где будет лежать анонимный класс**/
public class Starter6 {

    /**Анонимным классом можно также инициализировать поле внешнего класса.
     * Главное, нельзя создать анонимный класс не присвоив его какой-нибудь
     * ссылке.**/

    public static void main(String[] args) {
        final IPrinter printer = new IPrinter() {

            @Override
            public void printText() {
                System.out.println("HELLO");
            }

        };
    }

}
