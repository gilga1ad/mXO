package j101_inner_class;

/**
 * Created by kollaps on 21.04.16.
 */
public class Usage {

    public static void main(String[] args) {
        final Account myAccount = new Account("123qwe123", "Denis");
        final Account.Card myCard = myAccount.new Card("1111 2222 3333 4444");

        System.out.println(myAccount.getAmount());
        myCard.withdraw(-1000);
        System.out.println(myAccount.getAmount());
    }

}
