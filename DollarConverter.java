package homework;

public class DollarConverter {
    private static final double rate = 0.92;

    public double dollarsToEuros(double dollars) {
        validateAmount(dollars); 
        return dollars * rate;
    }

    private void validateAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount in dollars cannot be negative");
        }
    }
}


/*
The DollarConverter class is designed to convert an amount from Euros to USD.
It uses a today's fixed exchange rate 0.92
The dollarsToEuros method takes a double representing dollars, 
f the input is negative, it throws an IllegalArgumentException, as negative currency amounts are invalid in this context.












*/