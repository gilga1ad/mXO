package j101_inner_class;

/**
 * Created by kollaps on 21.04.16.
 */
public class Account {

    private double amount;

    private final String number;

    private final String owner;

    public Account(String number, String owner) {
        this.number = number;
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    private synchronized double withdraw(final double amountToWithdraw) {
        if (amountToWithdraw > getAmount()) {
            final double amountToReturn = getAmount();
            this.amount = 0;
            return amountToReturn;
        }
        //if (amountToWithdraw < 0) return .0;
        this.amount = this.amount - amountToWithdraw;
        return amountToWithdraw;
    }

    public class Card {

        private final String number;

        public Card(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public double withdraw(final double amountToWithdraw) {
            return Account.this.withdraw(amountToWithdraw);
        }

    }
}
