package j101_aclass;

/**
 * Created by kollaps on 18.04.16.
 */
/**Если хотя бы один метод класса абстрактный, то и весь класс должен
 * быть абстрактным**/
/**Абстрактный класса рекомендуется называть начиная со слова Abstract, иначе
 * разработчики, которые буду читать код, решат что это полноценный завершенный класс**/
public abstract class AbstractSmileProcessor {

    /**Остальная логика класса (кроме абстрактный методов) может быть реализована**/
    /**Причем, та команда, которая пишет метод process() понятие не имеет
     * кто и как реализует метод readString()**/
    public void process() {
        final String text = this.readString();
        final String result = text.replace(":)", "=)");
        System.out.println(result);
    }

    /**Для того, чтобы метод был без тела, его необходимо
     * сделать абстрактным**/
    protected abstract String readString();

    protected  abstract void writeString(final String text);

}
