public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        int totalEuros = this.euros() + addition.euros();
        int totalCents = this.cents() + addition.cents();

        if (totalCents >= 100) {
            totalEuros += totalCents / 100;
            totalCents %= 100;
        }

        return new Money(totalEuros, totalCents);
    }

    public Money minus(Money decreaser) {
        int totalEuros = this.euros() - decreaser.euros();
        int totalCents = this.cents() - decreaser.cents();

        if (totalCents < 0) {
            totalCents += 100;
            totalEuros -= 1;
        }

        if (totalEuros < 0) {
            return new Money(0, 0);
        }

        return new Money(totalEuros, totalCents);
    }

    public boolean lessThan(Money compared) {
        if (compared.euros() < this.euros()) {
            return false;
        } else if (compared.euros() == this.euros()) {
            if (compared.cents() < this.cents()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}
