package j101_list;

import java.util.*;

/**Homework**/

/**
 * Created by kollaps on 20.04.16.
 */
class ArrayList implements IList {

    Object[] objects = new Object[100];
    int size = 0;

    public synchronized void add(final Object element) {
        if(size == objects.length) {
            objects = Arrays.copyOf(objects, objects.length*2);
        }
        objects[size++] = element;
    }

    public synchronized void removeLast() {
        if (size != 0) size--;
    }

    public int size() {
        return size;
    }

    public Object get(final int index) {
        if(index >= 0 && index < size) {
            return objects[index];
        } else {
            return null;
        }
    }

    public synchronized void set(final int index, final Object object) {
        if(index >= 0 && index < size) objects[index] = object;

        if(index == size) this.add(object);
    }

}
