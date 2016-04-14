package view;

/**
 * Created by kollaps on 14.04.16.
 */
public class Dot {

    private volatile int x;

    private volatile int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        Dot d = new Dot(0, 0);

        new Thread(new Runnable() {         // Запускаем параллельный поток
            @Override
            public void run() {
                while (true) {
                    if (d.getX() != d.getY()) {
                        System.out.printf("0_0, %d, %d \n", d.getX(), d.getY());
                    }
                }
            }
        }).start();

        for(int i2 = 0; i2 < 2_000_000_000; i2++) {
            for(int i = 0; i < 100; i++) {
                d.setX(i);
                d.setY(i);
            }
        }

        /*Такое расхождение в результатах получается, потому что наш параллельный поток
        * читает данные (в процессе изменения) до того как выполняются обе set-функции
        * в циклах (в смысле, чтение выполняется после первой и до второй set-функции).
        * Такое случается, когда класс сделан МУТИРУЕМЫМ.*/
    }
}
