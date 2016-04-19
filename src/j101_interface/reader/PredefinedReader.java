package j101_interface.reader;

/**
 * Created by kollaps on 17.04.16.
 */
public class PredefinedReader implements IReader {

    private final String str;

    /**Тот кто будет создавать PredefinedReader, передаст конкретную
     * строчку, которую read() будет возвращать**/
    public PredefinedReader(String str) {
        this.str = str;
    }

    @Override
    public String read() {
        return str;
    }

}
