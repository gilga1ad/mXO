package view;

import java.util.Scanner;

/**
 * Created by kollaps on 13.04.16.
 */
public class MenuView {

    private static final int START_CODE = 1;

/*     Название getChoice() было бы не корректным, потому что из этого названия
     следуем, что мы что-то получаем от пользователя, но совсем не следует, что мы
     что-то показываем пользователя, как это требует фукнция*/
    public int showMenuWithResult() {
        System.out.println(START_CODE + " - Start");
        System.out.println("2 - Load");
        System.out.println("3 - Setting");
        System.out.println("4 - Exit");
        System.out.print("> ");

        final Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch(choice) {
            case START_CODE:
                System.out.println("Start");
                break;
            case 2:
                System.out.println("Load");
                break;
            case 3:
                System.out.println("Setting");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Really?");
        }

    return 0;
    }
}
