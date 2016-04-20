package j101_list;

/**
 * Created by kollaps on 20.04.16.
 */
public interface IList {

    void add(final Object element);

    void removeLast();

    int size();

    Object get(final int index);

    void set(final int index, final Object object);

}
