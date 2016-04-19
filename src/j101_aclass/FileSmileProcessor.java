package j101_aclass;

/**
 * Created by kollaps on 18.04.16.
 */
/**В классе-потомке абстрактного класса необходимо реализовать
 * все абстрактные методы родителя**/
public class FileSmileProcessor extends AbstractSmileProcessor {

    @Override
    protected String readString() {
        return "Text from:) file:) :)";
    }

    @Override
    protected void writeString(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        final FileSmileProcessor fileSmileProcessor = new FileSmileProcessor();
        fileSmileProcessor.process();
    }
}
