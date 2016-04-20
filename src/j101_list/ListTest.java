package j101_list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kollaps on 20.04.16.
 */
public class ListTest {

    public static void main(String[] args) {
        /**List - это название интерфейса. Поскольку это интерфейс, то есть
         * его различные реализации. ArrayList - это реализация, которая
         * имплементирует интерфейс List на массиве.**/
        List myList = new ArrayList();
        /**Входящий аргумент метода: класс Object. Так как все классы являются
         * наследниками класса Object, метод может примимать в качестве аргумента
         * любой объект любого класса**/
        myList.add(12);      // не забудь посмотреть реализации (ctrl+) этого метода, remove(), get() и size()
        /**Проблема: поскольку в функцию мы кладем Object, то List хранит только
         * Object-ы и, следовательно, возвращает он только Object. List не знает
         * какого типа в действительности каждый объект.**/
        Object a = myList.get(0);
        //Integer b = myList.get(0);        // не скомпилируется
        /**Необходимо явно сказать, что в нулевой ячейке лежит Integer
         * (приведение типа)**/
        Integer b = (Integer) myList.get(0);    // ok

        myList.add("Hello");
        System.out.println(myList);     // это отобразится на экране
        /**При привидении типа нужно быть осторожным. Если привести
         * объет не к своему типу, то возникнет ошибка на этапе выполнения
         * (код скомпилируется, но при работе программа упадет)**/
        Integer c = (Integer) myList.get(1);
    }
}